package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.mbg.mapper.CmsSubjectMapper;
import com.macro.mall.tiny.mbg.model.CmsSubject;
import com.macro.mall.tiny.mbg.model.CmsSubjectExample;
import com.macro.mall.tiny.service.CmsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Description:    商品专题Service实现类
 * @Author:         pcx
 * @CreateDate:     2019/8/21 22:32
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 22:32
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper cmsSubjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        return cmsSubjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        CmsSubjectExample cmsSubjectExample = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria=cmsSubjectExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return cmsSubjectMapper.selectByExample(cmsSubjectExample);
    }
}
