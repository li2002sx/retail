package com.mtime.client.retail.service;

import com.mtime.bcl.util.config.Config;
import com.mtime.bcl.util.ioc.ServiceLocator;
import com.mtime.client.retail.contract.dto.MerchantProtos;
import com.mtime.client.retail.contract.iface.MerchantService;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: MerchantServiceImplTest
 * @Package: com.mtime.client.retail.service
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/4/7 11:48
 * @version: V1.0
 */
public class MerchantServiceImplTest extends AbstractTest {

    @Autowired
    MerchantService merchantService;

    public void setUp() throws Exception {
        super.setUp();
        merchantService = ServiceLocator.current().getInstance("merchantServiceImpl", MerchantService.class);
    }

    public void testGetMerchantById() throws Exception {
        MerchantProtos.Merchant merchant = merchantService.getMerchantById(1087);
        System.out.println(merchant);
    }
}