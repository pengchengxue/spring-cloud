package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 优惠券和商品分类关系自定义Dao
 * @Author: pcx
 * @CreateDate: 2019/10/16 17:54
 * @UpdateUser: pcx
 * @UpdateDate: 2019/10/16 17:54
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface SmsCouponProductCategoryRelationDao {


    int insertList(@Param("list") List<SmsCouponProductCategoryRelation> productCategoryRelationList);


}
