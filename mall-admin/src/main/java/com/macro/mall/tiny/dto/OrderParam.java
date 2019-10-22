package com.macro.mall.tiny.dto;


import lombok.Data;

/**
 * @Description:   生成订单时传入的参数
 * @Author:         pcx
 * @CreateDate:     2019/8/5 15:33
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 15:33
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;

    public Long getMemberReceiveAddressId() {
        return memberReceiveAddressId;
    }

    public void setMemberReceiveAddressId(Long memberReceiveAddressId) {
        this.memberReceiveAddressId = memberReceiveAddressId;
    }

//    public Long getCouponId() {
//        return couponId;
//    }
//
//    public void setCouponId(Long couponId) {
//        this.couponId = couponId;
//    }
//
//    public Integer getPayType() {
//        return payType;
//    }
//
//    public void setPayType(Integer payType) {
//        this.payType = payType;
//    }
//
//    public Integer getUseIntegration() {
//        return useIntegration;
//    }
//
//    public void setUseIntegration(Integer useIntegration) {
//        this.useIntegration = useIntegration;
//    }



}
