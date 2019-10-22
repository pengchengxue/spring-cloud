package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:    产品查询参数
 * @Author:         pcx
 * @CreateDate:     2019/8/21 18:25
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 18:25
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class PmsProductQueryParam {

    @ApiModelProperty("上架状态")
    private Integer publishStatus;
    @ApiModelProperty("审核状态")
    private Integer verifyStatus;
    @ApiModelProperty("商品名称模糊关键字")
    private String keyword;
    @ApiModelProperty("商品货号")
    private String productSn;
    @ApiModelProperty("商品分类编号")
    private Long productCategoryId;
    @ApiModelProperty("商品品牌编号")
    private Long brandId;



}
