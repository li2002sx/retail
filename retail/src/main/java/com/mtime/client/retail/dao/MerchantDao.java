package com.mtime.client.retail.dao;

import com.mtime.client.retail.dao.common.BaseDao;
import com.mtime.client.retail.dao.support.DataSource;
import com.mtime.client.retail.dao.support.DatabaseName;
import com.mtime.client.retail.dao.support.MultipleDataSource;
import com.mtime.client.retail.model.Merchant;
import org.springframework.stereotype.Repository;

/**
 * @Title: OrderDao
 * @Package: com.mtime.client.retail.dao
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/1 19:06
 * @version: V1.0
 */
@Repository
public class MerchantDao extends BaseDao {

    @DataSource(DatabaseName.Merchant)
    public Merchant getMerchantById(int merchantId) {
//        MultipleDataSource.setDataSourceKey(DatabaseName.Merchant);
        return sqlSessionTemplate.selectOne("merchant.selectByMerchantId", merchantId);
    }
}
