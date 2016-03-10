package com.mtime.client.retail.service.assembler;

import com.mtime.client.retail.contract.dto.MerchantProtos;
import com.mtime.client.retail.contract.dto.*;
import com.mtime.client.retail.model.*;

/**
 * @Title: OrderAssembler
 * @Package: com.mtime.client.retail.service.assembler
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 13:22
 * @version: V1.0
 */
public class MerchantAssembler {

    public static MerchantProtos.Merchant.Builder modelToProto(Merchant info) {
        MerchantProtos.Merchant.Builder builder = MerchantProtos.Merchant.newBuilder();
        if (info != null) {
            builder.setMerchantID(info.getMerchantID());
            builder.setMerchantName(info.getMerchantName());
        }
        return builder;
    }
}
