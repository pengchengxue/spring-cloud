package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.UmsMemberLevelMapper;
import com.macro.mall.tiny.mbg.model.UmsMemberLevel;
import com.macro.mall.tiny.mbg.model.UmsMemberLevelExample;
import com.macro.mall.tiny.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:    会员等级管理Service实现类
 * @Author:         pcx
 * @CreateDate:     2019/8/22 0:00
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 0:00
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {

    @Autowired
    protected UmsMemberLevelMapper umsMemberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example =new UmsMemberLevelExample();
        UmsMemberLevelExample.Criteria criteria = example.createCriteria();
        criteria.andDefaultStatusEqualTo(defaultStatus);
        return umsMemberLevelMapper.selectByExample(example);
    }
}
