package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.SmsFlashPromotionSessionDetail;
import com.macro.mall.tiny.mbg.model.SmsFlashPromotionSession;

import java.util.List;

/**
 * @Description:    限时购场次管理Service
 * @Author:         pcx
 * @CreateDate:     2019/9/18 18:49
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/9/18 18:49
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface SmsFlashPromotionSessionService {

    /**
     * 添加场次
     */
    int create(SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次
     */
    int update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次启用状态
     */
    int updateStatus(Long id, Integer status);

    /**
     * 删除场次
     */
    int delete(Long id);

    /**
     * 获取详情
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * 根据启用状态获取场次列表
     */
    List<SmsFlashPromotionSession> list();

    /**
     * 获取全部可选场次及其数量
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
