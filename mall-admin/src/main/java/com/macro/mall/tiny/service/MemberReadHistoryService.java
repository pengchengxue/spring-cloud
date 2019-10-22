package com.macro.mall.tiny.service;

import com.macro.mall.tiny.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @Description:    会员浏览记录管理Service
 * @Author:         pcx
 * @CreateDate:     2019/8/4 22:46
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/4 22:46
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface MemberReadHistoryService {

    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);



}
