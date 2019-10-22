package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:    订单查询参数
 * @Author:         pcx
 * @CreateDate:     2019/8/22 0:53
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 0:53
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class OmsOrderQueryParam {

    @ApiModelProperty(value = "订单编号")
    private String orderSn;
    @ApiModelProperty(value = "收货人姓名/号码")
    private String receiverKeyword;
    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;
    @ApiModelProperty(value = "订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;
    @ApiModelProperty(value = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;
    @ApiModelProperty(value = "订单提交时间")
    private String createTime;


}
