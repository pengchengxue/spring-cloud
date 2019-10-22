package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.mbg.mapper.OmsOrderReturnReasonMapper;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnReason;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnReasonExample;
import com.macro.mall.tiny.service.OmsOrderReturnReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 订单原因管理Service实现类
 * @Author: pcx
 * @CreateDate: 2019/8/22 23:05
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 23:05
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {

    @Autowired
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

    @Override
    public int create(OmsOrderReturnReason returnReason) {
        return omsOrderReturnReasonMapper.insert(returnReason);
    }

    @Override
    public int update(Long id, OmsOrderReturnReason returnReason) {
        returnReason.setId(id);
        return omsOrderReturnReasonMapper.updateByPrimaryKey(returnReason);
    }

    @Override
    public int delete(List<Long> ids) {
        OmsOrderReturnReasonExample example = new OmsOrderReturnReasonExample();
        example.createCriteria().andIdIn(ids);
        return omsOrderReturnReasonMapper.deleteByExample(example);
    }

    @Override
    public List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        OmsOrderReturnReasonExample example=new OmsOrderReturnReasonExample();
        example.setOrderByClause("sort desc");
        return omsOrderReturnReasonMapper.selectByExample(example);
    }

    @Override
    public int updateStatus(List<Long> ids, Integer status) {
        if(!status.equals(0)&&!status.equals(1)){
            return 0;
        }
        OmsOrderReturnReason omsOrderReturnReason=new OmsOrderReturnReason();
        omsOrderReturnReason.setStatus(status);
        OmsOrderReturnReasonExample example=new OmsOrderReturnReasonExample();
        example.createCriteria().andIdIn(ids);
        return omsOrderReturnReasonMapper.updateByExampleSelective(omsOrderReturnReason,example);
    }

    @Override
    public OmsOrderReturnReason getItem(Long id) {
        return omsOrderReturnReasonMapper.selectByPrimaryKey(id);
    }
}
