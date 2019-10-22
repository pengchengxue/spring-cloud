package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.OmsCompanyAddress;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnApply;
import lombok.Data;

/**
 * @Description:    申请信息封装
 * @Author:         pcx
 * @CreateDate:     2019/8/22 21:53
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 21:53
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {

    private OmsCompanyAddress companyAddress;


}
