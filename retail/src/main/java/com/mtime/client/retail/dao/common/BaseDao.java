package com.mtime.client.retail.dao.common;

import org.mybatis.spring.SqlSessionTemplate;
import javax.annotation.Resource;

/**
 * @Title: BaseDao
 * @Package: com.mtime.client.retail.dao.common
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/2 10:29
 * @version: V1.0
 */
public abstract class BaseDao {
    @Resource
    protected SqlSessionTemplate sqlSessionTemplate;
}
