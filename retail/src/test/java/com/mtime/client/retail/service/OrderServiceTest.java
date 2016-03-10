package com.mtime.client.retail.service;

import com.mtime.bcl.util.config.Config;
import com.mtime.bcl.util.ioc.ServiceLocator;
import com.mtime.client.retail.contract.dto.OrderProtos;
import com.mtime.client.retail.contract.iface.OrderService;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @Title: OrderServiceTest
 * @Package: com.mtime.client.retail.service
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 14:22
 * @version: V1.0
 */
public class OrderServiceTest extends TestCase {

    @Autowired
    OrderService orderService;

    public void setUp() throws Exception {
        super.setUp();
        Config.setConfigDirToClassPath();
        new ClassPathXmlApplicationContext("etc/spring/spring-root.xml");
        orderService = ServiceLocator.current().getInstance("orderServiceImpl", OrderService.class);
    }

    public void testGetOrderById() throws Exception {
        OrderProtos.Order order = orderService.getOrderById(660);
        System.out.println(order);

        Map<String, String> hm = new LinkedHashMap<>();
        hm.put("1", "A");
        hm.put("3", "C");
        hm.put("5", "E");
        hm.put("2", "B");
        hm.put("4", "D");

        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            System.out.printf("%s --- %s\r\n", entry.getKey(), entry.getValue());
        }
    }
}