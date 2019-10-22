package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.CmsSubject;

import java.util.List;

/**
 * @Description:    商品专题Service
 * @Author:         pcx
 * @CreateDate:     2019/8/21 22:31
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 22:31
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface CmsSubjectService {

    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
