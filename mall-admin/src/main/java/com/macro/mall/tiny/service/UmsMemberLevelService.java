package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsMemberLevel;

import java.util.List;

/**
 * @Description: 会员等级管理Service
 * @Author: pcx
 * @CreateDate: 2019/8/21 23:57
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 23:57
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface UmsMemberLevelService {

    /**
     * 获取所有会员登录
     *
     * @param defaultStatus 是否为默认会员
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/21 23:57
     */
    List<UmsMemberLevel> list(Integer defaultStatus);


}
