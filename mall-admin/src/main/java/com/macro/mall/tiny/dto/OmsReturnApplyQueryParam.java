package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description: 订单退货申请查询参数
 * @Author: pcx
 * @CreateDate: 2019/8/22 21:40
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 21:40
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class OmsReturnApplyQueryParam {

    @ApiModelProperty("服务单号")
    private Long id;
    @ApiModelProperty(value = "收货人姓名/号码")
    private String receiverKeyword;
    @ApiModelProperty(value = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;
    @ApiModelProperty(value = "申请时间")
    private String createTime;
    @ApiModelProperty(value = "处理人员")
    private String handleMan;
    @ApiModelProperty(value = "处理时间")
    private String handleTime;
}
