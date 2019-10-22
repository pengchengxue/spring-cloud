package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.OmsOrderReturnApplyResult;
import com.macro.mall.tiny.dto.OmsReturnApplyQueryParam;
import com.macro.mall.tiny.dto.OmsUpdateStatusParam;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnApply;

import java.util.List;

/**
 * @Description:    退货申请管理Service
 * @Author:         pcx
 * @CreateDate:     2019/8/22 21:38
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 21:38
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */


public interface OmsOrderReturnApplyService {

    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);



}
