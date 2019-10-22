package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.OmsOrderReturnReason;

import java.util.List;

/**
 * @Description:    订单原因管理Service
 * @Author:         pcx
 * @CreateDate:     2019/8/22 23:04
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 23:04
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface OmsOrderReturnReasonService {

    /**
     * 添加订单原因
     */
    int create(OmsOrderReturnReason returnReason);

    /**
     * 修改退货原因
     */
    int update(Long id, OmsOrderReturnReason returnReason);

    /**
     * 批量删除退货原因
     */
    int delete(List<Long> ids);

    /**
     * 分页获取退货原因
     */
    List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    /**
     * 批量修改退货原因状态
     */
    int updateStatus(List<Long> ids, Integer status);

    /**
     * 获取单个退货原因详情信息
     */
    OmsOrderReturnReason getItem(Long id);


}
