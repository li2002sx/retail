package com.mtime.client.retail.service;

import com.mtime.client.retail.contract.dto.*;
import com.mtime.client.retail.contract.iface.*;
import com.mtime.client.retail.manager.*;
import com.mtime.client.retail.model.*;
import com.mtime.client.retail.service.assembler.*;
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
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantManager merchantManager;

    public MerchantProtos.Merchant getMerchantById(Integer merchantId){
        Merchant merchant = merchantManager.getMerchantById(merchantId);
        return MerchantAssembler.modelToProto(merchant).build();
    }
}
