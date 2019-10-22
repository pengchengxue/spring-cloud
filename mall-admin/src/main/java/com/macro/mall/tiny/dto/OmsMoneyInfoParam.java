package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description: 修改订单费用信息参数
 * @Author: pcx
 * @CreateDate: 2019/9/18 17:30
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 17:30
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class OmsMoneyInfoParam {

    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("")
    private BigDecimal freightAmount;
    @ApiModelProperty("")
    private BigDecimal discountAmount;
    @ApiModelProperty("状态")
    private Integer status;

}
