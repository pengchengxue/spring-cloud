package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.mbg.mapper.SmsCouponHistoryMapper;
import com.macro.mall.tiny.mbg.model.SmsCouponHistory;
import com.macro.mall.tiny.mbg.model.SmsCouponHistoryExample;
import com.macro.mall.tiny.service.SmsCouponHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Description:    优惠券领取记录管理Service实现类
 * @Author:         pcx
 * @CreateDate:     2019/10/16 21:42
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/10/16 21:42
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {

    @Autowired
    private SmsCouponHistoryMapper historyMapper;
    @Override
    public List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        SmsCouponHistoryExample example = new SmsCouponHistoryExample();
        SmsCouponHistoryExample.Criteria criteria = example.createCriteria();
        if(couponId!=null){
            criteria.andCouponIdEqualTo(couponId);
        }
        if(useStatus!=null){
            criteria.andUseStatusEqualTo(useStatus);
        }
        if(!StringUtils.isEmpty(orderSn)){
            criteria.andOrderSnEqualTo(orderSn);
        }
        return historyMapper.selectByExample(example);
    }
}
