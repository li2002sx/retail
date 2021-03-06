#!/bin/sh
#
# 时光网Java程序启动脚本 v1.0
#
###################################
# 环境变量及程序执行参数
# 需要根据实际环境以及Java程序名称来修改这些参数
###################################
# 需要启动的Java主程序（main方法类）
APP_MAINCLASS=com.mtime.client.retail.ServiceBootStrap
# Java程序所在的目录（classes的上一级目录）
APP_HOME="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
PID_PATH="$APP_HOME/app.pid"
# JDK所在路径
# JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home"
JAVA_HOME=""
JAVA_PATH="java"
JPS_PATH="jps"
if [ -n "$JAVA_HOME" ]; then
    JAVA_PATH="$JAVA_HOME/bin/$JAVA_PATH"
    JPS_PATH="$JAVA_HOME/bin/$JPS_PATH"
fi
# 执行程序启动所使用的系统用户，考虑到安全，推荐不使用root帐号
# RUNNING_USER=noname
# java虚拟机启动参数
JAVA_OPTS="-Xmx2048m -Djava.net.preferIPv4Stack=true -Djava.awt.headless=true"
# 拼凑完整的classpath参数，包括指定lib目录下所有的jar
# CLASSPATH="$APP_HOME"/lib/*
CLASSPATH="$APP_HOME"
for i in "$APP_HOME"/lib/*.jar; do
    # 如果路径有空格可能会有问题?
    if [ -z "$CLASSPATH" ]; then
        CLASSPATH="$i"
    else
        CLASSPATH="$CLASSPATH":"$i"
    fi
done

###################################
# (函数)判断程序是否已启动
#
# 说明：
# 使用JDK自带的JPS命令及grep命令组合，准确查找pid
# jps 加 l 参数，表示显示java的完整包路径
# 使用awk，分割出pid ($1部分)，及Java程序名称($2部分)
###################################
# 初始化psid变量（全局）
psid=0
checkpid() {
    pid=0
    if [ -f "$PID_PATH" ]; then
        pid=`cat "$PID_PATH"`
        if [ $? -ne 0 ]; then
            echo "failed to read pid"
            exit 1
        fi
    else
        return
    fi

    javaps=`ps -ax | grep $APP_MAINCLASS | grep $pid`
    if [ -n "$javaps" ]; then
        psid=`echo $javaps | awk '{print $1}'`
    else
        psid=0
    fi
}

###################################
# (函数)直接运行程序

# 说明：此方法主要用于测试运行
###################################
run() {
    echo "Starting $APP_MAINCLASS ..."
    $JAVA_PATH $JAVA_OPTS -classpath $CLASSPATH $APP_MAINCLASS
}

###################################
# (函数)启动程序

# 说明：
# 1. 首先调用checkpid函数，刷新$psid全局变量
# 2. 如果程序已经启动（$psid不等于0），则提示程序已启动
# 3. 如果程序没有被启动，则执行启动命令行
# 4. 启动命令执行后，再次调用checkpid函数
# 5. 如果步骤4的结果能够确认程序的pid,则打印[OK]，否则打印[Failed]
# 注意：echo -n 表示打印字符后，不换行
# 注意: "nohup 某命令 >/dev/null 2>&1 &" 的用法
###################################
start() {
    checkpid
    if [ $psid -ne 0 ]; then
        echo "================================"
        echo "Warn: $APP_MAINCLASS already started! (pid=$psid)"
        echo "================================"
    else
        echo "Starting $APP_MAINCLASS ..."
        # 如果要指定账户运行
        # JAVA_CMD="nohup $JAVA_PATH $JAVA_OPTS -classpath $CLASSPATH $APP_MAINCLASS >/dev/null 2>&1 &"
        # su - $RUNNING_USER -c "$JAVA_CMD"
        nohup $JAVA_PATH $JAVA_OPTS -classpath $CLASSPATH $APP_MAINCLASS >/dev/null 2>&1 &
        if [ $? -eq 0 ]; then
            psid=$!
            echo "(pid=$psid) [OK]"
            echo $psid > "$PID_PATH"
            if [ $? -ne 0 ]; then
                echo "Warn: failed to write pid"
                exit 1
            fi
        else
            echo "[Failed]"
            exit 1
        fi
    fi
}

###################################
# (函数)停止程序
#
# 说明：
# 1. 首先调用checkpid函数，刷新$psid全局变量
# 2. 如果程序已经启动（$psid不等于0），则开始执行停止，否则，提示程序未运行
# 3. 使用kill -9 pid命令进行强制杀死进程
# 4. 执行kill命令行紧接其后，马上查看上一句命令的返回值: $?
# 5. 如果步骤4的结果$?等于0,则打印[OK]，否则打印[Failed]
# 6. 为了防止java程序被启动多次，这里增加反复检查进程，反复杀死的处理（递归调用stop）。
# 注意：echo -n 表示打印字符后，不换行
# 注意: 在shell编程中，"$?" 表示上一句命令或者一个函数的返回值
###################################
stop() {
    checkpid

    if [ $psid -ne 0 ]; then
        echo "Stopping $APP_MAINCLASS ...(pid=$psid) "
        # su - $RUNNING_USER -c "kill -9 $psid"
        kill -9 $psid
        if [ $? -eq 0 ]; then
            echo "[OK]"
        else
            echo "[Failed]"
        fi

        checkpid
        if [ $psid -ne 0 ]; then
            stop
        fi
    else
        echo "================================"
        echo "Warn: $APP_MAINCLASS is not running"
        echo "================================"
    fi
}

###################################
# (函数)检查程序运行状态
#
# 说明：
# 1. 首先调用checkpid函数，刷新$psid全局变量
# 2. 如果程序已经启动（$psid不等于0），则提示正在运行并表示出pid
# 3. 否则，提示程序未运行
###################################
status() {
    checkpid

    if [ $psid -ne 0 ];  then
        echo "$APP_MAINCLASS is running! (pid=$psid)"
    else
        echo "$APP_MAINCLASS is not running"
    fi
}

###################################
# (函数)打印系统环境参数
###################################
info() {
    echo "System Information:"
    echo "****************************"
    # echo `head -n 1 /etc/issue`
    echo `uname -a`
    echo
    echo "JAVA_HOME=$JAVA_HOME"
    echo `$JAVA_PATH -version`
    echo "APP_HOME=$APP_HOME"
    echo "APP_MAINCLASS=$APP_MAINCLASS"
    echo "****************************"
}

###################################
# 读取脚本的第一个参数($1)，进行判断
# 参数取值范围：{start|stop|restart|status|info}
# 如参数不在指定范围之内，则打印帮助信息
###################################
case "$1" in
    'run')
        run
        ;;
    'start')
        start
        ;;
    'stop')
        stop
        ;;
    'restart')
        stop
        start
        ;;
    'status')
        status
        ;;
    'info')
        info
        ;;
    *)
        echo "Usage: $0 {run|start|stop|restart|status|info}"
        exit 1
esac