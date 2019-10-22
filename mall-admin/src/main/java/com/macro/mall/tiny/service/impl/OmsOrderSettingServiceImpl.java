package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.OmsOrderSettingMapper;
import com.macro.mall.tiny.mbg.model.OmsOrderSetting;
import com.macro.mall.tiny.mbg.model.OmsOrderSettingExample;
import com.macro.mall.tiny.service.OmsOrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:    订单设置管理Service实现类
 * @Author:         pcx
 * @CreateDate:     2019/8/22 21:22
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 21:22
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    @Autowired
    private OmsOrderSettingMapper omsOrderSettingMapper;


    @Override
    public OmsOrderSetting getItem(Long id) {

        return omsOrderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return omsOrderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
