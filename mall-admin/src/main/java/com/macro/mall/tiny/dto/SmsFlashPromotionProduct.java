package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.mbg.model.SmsFlashPromotionProductRelation;
import lombok.Data;

/**
 * @Description:    限时购及商品信息封装
 * @Author:         pcx
 * @CreateDate:     2019/10/16 17:29
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/10/16 17:29
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {

    private PmsProduct product;

    
}
