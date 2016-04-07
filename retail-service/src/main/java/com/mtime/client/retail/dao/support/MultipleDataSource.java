package com.mtime.client.retail.dao.support;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Title: MultipleDataSource
 * @Package: com.mtime.client.retail.dao.common
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 16:40
 * @version: V1.0
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}
