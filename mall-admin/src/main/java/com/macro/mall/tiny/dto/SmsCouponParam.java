package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.SmsCoupon;
import com.macro.mall.tiny.mbg.model.SmsCouponProductCategoryRelation;
import com.macro.mall.tiny.mbg.model.SmsCouponProductRelation;
import lombok.Data;

import java.util.List;

/**
 * @Description: 优惠券信息封装，包括绑定商品和绑定分类
 * @Author: pcx
 * @CreateDate: 2019/10/16 17:48
 * @UpdateUser: pcx
 * @UpdateDate: 2019/10/16 17:48
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class SmsCouponParam extends SmsCoupon {

    //优惠券绑定的商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券绑定的商品分类
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}
