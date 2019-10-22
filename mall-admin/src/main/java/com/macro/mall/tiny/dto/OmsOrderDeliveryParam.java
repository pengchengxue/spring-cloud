package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description: 订单发货参数
 * @Author: pcx
 * @CreateDate: 2019/9/18 17:22
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 17:22
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class OmsOrderDeliveryParam {

    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("物流公司")
    private String deliveryCompany;
    @ApiModelProperty("物流单号")
    private String deliverySn;
}
