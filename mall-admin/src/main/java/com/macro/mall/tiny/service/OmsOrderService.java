package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.*;
import com.macro.mall.tiny.mbg.model.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:    java类作用描述
 * @Author:         pcx
 * @CreateDate:     2019/8/22 0:51
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 0:51
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface OmsOrderService {

    /**
     * 订单查询
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量发货
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     */
    @Transactional
    int close(List<Long> ids, String note);

    /**
     * 批量删除订单
     */
    int delete(List<Long> ids);

    /**
     * 获取指定订单详情
     */
    OmsOrderDetail detail(Long id);

    /**
     * 修改订单收货人信息
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改订单备注
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);




}
