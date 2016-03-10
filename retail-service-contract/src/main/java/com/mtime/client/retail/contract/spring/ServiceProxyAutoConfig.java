package com.mtime.client.retail.contract.spring;

import com.mtime.bcl.soa.rpc.RemoteClient;
import com.mtime.client.retail.contract.iface.OrderService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Title: ServiceProxyAutoConfig
 * @Package: com.mtime.client.retail.contract.spring
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 15:20
 * @version: V1.0
 */
@Configuration
@Lazy
@Order(Ordered.LOWEST_PRECEDENCE)
public class ServiceProxyAutoConfig {
    @Bean
    @ConditionalOnMissingBean
    public OrderService orderService() {
        return RemoteClient.getService("retail-service", OrderService.class);
    }
}
