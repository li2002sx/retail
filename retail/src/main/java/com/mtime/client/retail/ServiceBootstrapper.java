package com.mtime.client.retail;

import com.mtime.bcl.soa.rpc.RemoteServer;
import com.mtime.bcl.util.config.Config;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: ServiceBootstrapper
 * @Package: com.mtime.client.retail
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 13:31
 * @version: V1.0
 */
public class ServiceBootstrapper {

    public static void main(String args[]) throws Exception {
        //启动服务
        Config.setConfigDirToClassPath();
        new ClassPathXmlApplicationContext("etc/spring/spring-root.xml");
        new RemoteServer().run();
    }
}
