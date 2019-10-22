package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.SmsFlashPromotion;

import java.util.List;

/**
 * @Description: 限时购活动管理Service
 * @Author: pcx
 * @CreateDate: 2019/9/18 18:28
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 18:28
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface SmsFlashPromotionService {

    /**
     * 添加活动
     */
    int create(SmsFlashPromotion flashPromotion);

    /**
     * 修改指定活动
     */
    int update(Long id, SmsFlashPromotion flashPromotion);

    /**
     * 删除单个活动
     */
    int delete(Long id);

    /**
     * 修改上下线状态
     */
    int updateStatus(Long id, Integer status);

    /**
     * 获取详细信息
     */
    SmsFlashPromotion getItem(Long id);

    /**
     * 分页查询活动
     */
    List<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum);

}
