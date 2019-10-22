package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;

/**
 * @Description: 会员管理Service
 * @Author: pcx
 * @CreateDate: 2019/8/4 14:52
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/4 14:52
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);


}
