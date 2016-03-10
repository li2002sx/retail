package com.mtime.client.retail.service;

import com.mtime.bcl.util.config.Config;
import com.mtime.bcl.util.ioc.ServiceLocator;
import com.mtime.client.retail.contract.dto.*;
import com.mtime.client.retail.contract.iface.*;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: MerchantServiceTest
 * @Package: com.mtime.client.retail.service
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/3 10:25
 * @version: V1.0
 */
public class MerchantServiceTest extends TestCase {

    @Autowired
    MerchantService merchantService;

    public void setUp() throws Exception {
        super.setUp();
        Config.setConfigDirToClassPath();
        new ClassPathXmlApplicationContext("etc/spring/spring-root.xml");
        merchantService = ServiceLocator.current().getInstance("merchantServiceImpl", MerchantService.class);
    }

    public void testGetMerchantById() throws Exception {
        MerchantProtos.Merchant merchant = merchantService.getMerchantById(1087);
        System.out.println(merchant);
    }
}