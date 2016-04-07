package com.mtime.client.retail.service;

import com.mtime.client.retail.contract.dto.OrderProtos;
import com.mtime.client.retail.contract.iface.OrderService;
import com.mtime.client.retail.manager.OrderManager;
import com.mtime.client.retail.model.Order;
import com.mtime.client.retail.service.assembler.OrderAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Title: OrderServiceImpl
 * @Package: com.mtime.client.retail.dao.service
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/1 19:08
 * @version: V1.0
 */
@Component
public class OrderServiceImpl {

    @Autowired
    OrderManager orderManager;

    public OrderProtos.Order getOrderById(Integer orderId){
        Order order = orderManager.getOrderById(orderId);
        return OrderAssembler.modelToProto(order).build();
    }
}
