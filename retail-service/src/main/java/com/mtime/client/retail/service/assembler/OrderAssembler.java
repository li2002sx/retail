package com.mtime.client.retail.service.assembler;

import com.mtime.client.retail.contract.dto.OrderProtos;
import com.mtime.client.retail.model.Order;

/**
 * @Title: OrderAssembler
 * @Package: com.mtime.client.retail.service.assembler
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 13:22
 * @version: V1.0
 */
public class OrderAssembler {

    public static OrderProtos.Order.Builder modelToProto(Order info) {
        OrderProtos.Order.Builder builder = OrderProtos.Order.newBuilder();
        if (info != null) {
            builder.setOrderID(info.getOrderID());
            builder.setOrderCode(info.getOrderCode());
        }
        return builder;
    }
}
