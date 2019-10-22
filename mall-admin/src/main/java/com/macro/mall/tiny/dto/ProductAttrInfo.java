package com.macro.mall.tiny.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:    商品分类对应属性信息
 * @Author:         pcx
 * @CreateDate:     2019/8/9 21:44
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 21:44
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class ProductAttrInfo {

    @ApiModelProperty("商品属性Id")
    private Long attributeId;
    @ApiModelProperty("商品属性分类Id")
    private Long attributeCategoryId;
}
