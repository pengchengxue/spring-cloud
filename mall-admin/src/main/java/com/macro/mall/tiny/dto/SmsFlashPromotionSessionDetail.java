package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.SmsFlashPromotionSession;
import lombok.Data;

/**
 * @Description: 包含商品数量的场次信息
 * @Author: pcx
 * @CreateDate: 2019/9/18 18:48
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 18:48
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {

    //商品数量
    private Long productCount;

}
