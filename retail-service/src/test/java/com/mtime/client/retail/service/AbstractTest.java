package com.mtime.client.retail.service;

import com.mtime.bcl.util.config.Config;
import com.mtime.bcl.util.ioc.ServiceLocator;
import com.mtime.client.retail.contract.iface.MerchantService;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: AbstractTest
 * @Package: com.mtime.client.retail.service
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/4/7 11:49
 * @version: V1.0
 */
public abstract class AbstractTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
        Config.setConfigDirToClassPath();
        new ClassPathXmlApplicationContext("etc/spring/spring-root.xml");
    }
}
