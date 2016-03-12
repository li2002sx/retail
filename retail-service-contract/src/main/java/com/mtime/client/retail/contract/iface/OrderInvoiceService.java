package com.mtime.client.retail.contract.iface;

import com.mtime.bcl.soa.annotations.Service;
import com.mtime.client.retail.contract.dto.CommonProtos;
import com.mtime.client.retail.contract.dto.OrderProtos;

/**
 * Created by Mtime on 2016/3/11.
 */
@Service("OrderInvoice")
public interface OrderInvoiceService {
    OrderProtos.OrderInvoiceInfo GetInvoiceByOrder(Integer orderID);
    CommonProtos.InvokeResult EditInvoiceInfo(OrderProtos.OrderInvoiceInfo info);
    CommonProtos.InvokeResult EditInvoiceStatus(Integer orderID,Integer status);
}