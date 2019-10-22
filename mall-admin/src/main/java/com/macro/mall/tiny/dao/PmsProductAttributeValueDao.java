package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 商品参数，商品自定义规格属性Dao
 * @Author: pcx
 * @CreateDate: 2019/8/21 23:35
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 23:35
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface PmsProductAttributeValueDao {

    /**
     * 批量插入商品自定义规格属性
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/21 23:36
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
