package com.mtime.client.retail.manager;

        import com.mtime.client.retail.contract.dto.OrderProtos;
        import org.springframework.beans.factory.annotation.Autowired;
        import com.mtime.client.retail.dao.OrderDao;
        import com.mtime.client.retail.model.Order;
        import org.springframework.stereotype.Component;

/**
 * @Title: OrderManager
 * @Package: com.mtime.client.retail.manager
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 11:57
 * @version: V1.0
 */
@Component
public class OrderManager {

    @Autowired
    OrderDao orderDao;
    public Order getOrderById(int orderId) {
        return orderDao.getOrderById(orderId);
    }
}
