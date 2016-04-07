package com.mtime.client.retail.dao.support;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @Title: DataSourceAspect
 * @Package: com.mtime.client.retail.dao.support
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/14 16:51
 * @version: V1.0
 */
public class DataSourceAspect {

    public void before(JoinPoint point) {
        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<?> clazz = target.getClass();
//        Class<?>[] classz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method m = clazz.getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
//                DynamicDataSourceHolder.putDataSource(data.value());
                MultipleDataSource.setDataSourceKey(data.value());
//                System.out.println(data.value());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
