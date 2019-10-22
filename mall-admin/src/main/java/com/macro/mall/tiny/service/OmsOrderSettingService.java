package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.OmsOrderSetting;

/**
 * @Description:    订单设置Service
 * @Author:         pcx
 * @CreateDate:     2019/8/22 21:22
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 21:22
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface OmsOrderSettingService {


    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);



}
