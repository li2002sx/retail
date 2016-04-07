package com.mtime.client.retail.service;

import com.mtime.bcl.soa.rpc.RemoteClient;
import com.mtime.bcl.util.ioc.ServiceLocator;
import com.mtime.client.retail.contract.dto.OrderProtos;
import com.mtime.client.retail.contract.iface.OrderInvoiceService;
import com.mtime.client.retail.contract.iface.OrderService;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Title: OrderServiceImplTest
 * @Package: com.mtime.client.retail.service
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/4/7 11:53
 * @version: V1.0
 */
public class OrderServiceImplTest extends AbstractTest {

    @Autowired
    OrderService orderService;
    OrderInvoiceService orderInvoiceService;

    public void setUp() throws Exception {
        super.setUp();
        orderService = RemoteClient.getService("retail_go", OrderService.class);
        orderInvoiceService = RemoteClient.getService("retail_go", OrderInvoiceService.class);
    }

    public void testGetOrderById() throws Exception {
        OrderProtos.OrderInfo order = orderService.GetOrderByID(3);
        System.out.println(order);
//        int a = 1 + 34;
//        int b = a + 5;
        /*OrderProtos.Order order = orderService.getOrderById(660);


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
        }*/
    }
}