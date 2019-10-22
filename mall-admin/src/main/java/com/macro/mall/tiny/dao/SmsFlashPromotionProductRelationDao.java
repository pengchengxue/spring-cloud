package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.dto.SmsFlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 限时购商品关联自定义Dao
 * @Author: pcx
 * @CreateDate: 2019/10/16 17:11
 * @UpdateUser: pcx
 * @UpdateDate: 2019/10/16 17:11
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface SmsFlashPromotionProductRelationDao {

    /**
     * 获取限时购及相关商品信息
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/10/16 17:11
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
