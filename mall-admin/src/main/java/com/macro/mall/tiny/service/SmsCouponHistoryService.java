package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.SmsCouponHistory;

import java.util.List;

/**
 * @Description:    优惠券领取记录管理Service
 * @Author:         pcx
 * @CreateDate:     2019/10/16 21:41
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/10/16 21:41
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface SmsCouponHistoryService {

    /**
     * 分页查询优惠券领取记录
     * @param couponId 优惠券id
     * @param useStatus 使用状态
     * @param orderSn 使用订单号码
     */
    List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}
