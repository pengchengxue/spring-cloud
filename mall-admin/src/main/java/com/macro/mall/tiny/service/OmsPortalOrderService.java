package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:    前台订单管理Service
 * @Author:         pcx
 * @CreateDate:     2019/8/5 15:32
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 15:32
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

}
