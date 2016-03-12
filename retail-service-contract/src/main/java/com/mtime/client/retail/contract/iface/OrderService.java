package com.mtime.client.retail.contract.iface;

import com.mtime.bcl.soa.annotations.Service;
import com.mtime.client.retail.contract.dto.CommonProtos;
import com.mtime.client.retail.contract.dto.OrderProtos;

/**
 * @Title: OrderService
 * @Package: com.mtime.client.retail.contract.iface
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/1 18:01
 * @version: V1.0
 */
@Service("Order")
public interface OrderService {

    //OrderProtos.Order getOrderById(Integer orderId);

    OrderProtos.OrderInfo GetOrderByID(Integer OrderID);
}
