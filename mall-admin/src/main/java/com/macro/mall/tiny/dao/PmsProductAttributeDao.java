package com.macro.mall.tiny.dao;


import com.macro.mall.tiny.dto.ProductAttrInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Description:    自定义商品属性Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/9 21:49
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 21:49
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductAttributeDao {

    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);


}
