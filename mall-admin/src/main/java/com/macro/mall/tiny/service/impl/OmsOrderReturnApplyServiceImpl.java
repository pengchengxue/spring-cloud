package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.dao.OmsOrderReturnApplyDao;
import com.macro.mall.tiny.dto.OmsOrderReturnApplyResult;
import com.macro.mall.tiny.dto.OmsReturnApplyQueryParam;
import com.macro.mall.tiny.dto.OmsUpdateStatusParam;
import com.macro.mall.tiny.mbg.mapper.OmsOrderReturnApplyMapper;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnApply;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnApplyExample;
import com.macro.mall.tiny.service.OmsOrderReturnApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:    订单退货管理Service
 * @Author:         pcx
 * @CreateDate:     2019/8/22 21:43
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 21:43
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {

    @Autowired
    private OmsOrderReturnApplyDao omsOrderReturnApplyDao;

    @Autowired
    private OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;
    @Override
    public List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return omsOrderReturnApplyDao.getList(queryParam);
    }

    @Override
    public int delete(List<Long> ids) {
        OmsOrderReturnApplyExample example=new OmsOrderReturnApplyExample();
        example.createCriteria().andIdIn(ids).andStatusEqualTo(3);
        return omsOrderReturnApplyMapper.deleteByExample(example);
    }

    @Override
    public int updateStatus(Long id, OmsUpdateStatusParam statusParam) {
        Integer status = statusParam.getStatus();
        OmsOrderReturnApply returnApply = new OmsOrderReturnApply();
        if(status.equals(1)){
            //确认退货
            returnApply.setId(id);
            returnApply.setStatus(1);
            returnApply.setReturnAmount(statusParam.getReturnAmount());
            returnApply.setCompanyAddressId(statusParam.getCompanyAddressId());
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(statusParam.getHandleMan());
            returnApply.setHandleNote(statusParam.getHandleNote());
        }else if(status.equals(2)){
            //完成退货
            returnApply.setId(id);
            returnApply.setStatus(2);
            returnApply.setReceiveTime(new Date());
            returnApply.setReceiveMan(statusParam.getReceiveMan());
            returnApply.setReceiveNote(statusParam.getReceiveNote());
        }else if(status.equals(3)){
            //拒绝退货
            returnApply.setId(id);
            returnApply.setStatus(3);
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(statusParam.getHandleMan());
            returnApply.setHandleNote(statusParam.getHandleNote());
        }else{
            return 0;
        }
        return omsOrderReturnApplyMapper.updateByPrimaryKeySelective(returnApply);
    }

    @Override
    public OmsOrderReturnApplyResult getItem(Long id) {
        return omsOrderReturnApplyDao.getDetail(id);
    }
}
