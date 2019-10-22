package com.macro.mall.tiny.dto;

import lombok.Data;

/**
 * @Description: 订单修改收货人信息参数
 * @Author: pcx
 * @CreateDate: 2019/9/18 17:32
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 17:32
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class OmsReceiverInfoParam {

    private Long orderId;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverDetailAddress;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private Integer status;


}
