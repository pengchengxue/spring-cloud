package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.CmsPrefrenceAreaMapper;
import com.macro.mall.tiny.mbg.model.CmsPrefrenceArea;
import com.macro.mall.tiny.mbg.model.CmsPrefrenceAreaExample;
import com.macro.mall.tiny.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:    优选专区ServiceImpl
 * @Author:         pcx
 * @CreateDate:     2019/8/21 23:04
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 23:04
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper cmsPrefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return cmsPrefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
