package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.SmsCouponParam;
import com.macro.mall.tiny.mbg.model.SmsCoupon;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 优惠券管理Service
 * @Author: pcx
 * @CreateDate: 2019/10/16 17:47
 * @UpdateUser: pcx
 * @UpdateDate: 2019/10/16 17:47
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface SmsCouponService {

    /**
     * 添加优惠券
     */
    @Transactional
    int create(SmsCouponParam couponParam);

    /**
     * 根据优惠券id删除优惠券
     */
    @Transactional
    int delete(Long id);

    /**
     * 根据优惠券id更新优惠券信息
     */
    @Transactional
    int update(Long id, SmsCouponParam couponParam);

    /**
     * 分页获取优惠券列表
     */
    List<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 获取优惠券详情
     *
     * @param id 优惠券表id
     */
    SmsCouponParam getItem(Long id);
}
