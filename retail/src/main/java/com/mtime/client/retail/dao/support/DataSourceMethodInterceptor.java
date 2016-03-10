package com.mtime.client.retail.dao.support;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang3.ClassUtils;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.Proxy;

/**
 * @Title: DataSourceMethodInterceptor
 * @Package: com.mtime.client.retail.dao.support
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/3 16:23
 * @version: V1.0
 */
public class DataSourceMethodInterceptor implements MethodInterceptor,InitializingBean {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Class<?> clazz = invocation.getThis().getClass();
        String className = clazz.getName();
        if (ClassUtils.isAssignable(clazz, Proxy.class)) {
            className = invocation.getMethod().getDeclaringClass().getName();
        }
        String methodName = invocation.getMethod().getName();
        Object[] arguments = invocation.getArguments();
        System.out.printf("execute %s.%s(%s)", className, methodName, arguments);
//        MultipleDataSource.setDataSourceKey(DatabaseName.Merchant);
        Object result = invocation.proceed();
        return result;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}
