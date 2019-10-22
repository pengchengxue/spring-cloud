package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.dto.PmsProductResult;
import com.macro.mall.tiny.mbg.model.CmsPrefrenceAreaProductRelation;
import com.macro.mall.tiny.mbg.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;


/**
 * @Description: 商品自定义Dao
 * @Author: pcx
 * @CreateDate: 2019/8/21 20:30
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 20:30
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface PmsProductDao {

    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);

    CmsSubjectProductRelation selectSubjectProductRelationByProductId(@Param("productId") Long productId);

    CmsPrefrenceAreaProductRelation selectPrefrenceAreaProductRelationByProductId(@Param("productId") Long productId);
}
