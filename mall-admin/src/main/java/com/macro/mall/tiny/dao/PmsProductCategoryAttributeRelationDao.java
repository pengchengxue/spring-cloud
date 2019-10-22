package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.PmsProductCategoryAttributeRelation;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Description:    自定义商品分类和属性关系Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/9 23:24
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 23:24
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductCategoryAttributeRelationDao {

    /**
    *  商品分类和属性关系插入
    * @author      pcx
    * @param null
    * @return
    * @exception
    * @date        2019/8/21 20:53
    */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);



}
