package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.SmsHomeRecommendSubject;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:    首页专题推荐管理Service
 * @Author:         pcx
 * @CreateDate:     2019/10/16 22:34
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/10/16 22:34
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface SmsHomeRecommendSubjectService {
    /**
     * 添加首页推荐
     */
    @Transactional
    int create(List<SmsHomeRecommendSubject> recommendSubjectList);

    /**
     * 修改推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除推荐
     */
    int delete(List<Long> ids);

    /**
     * 更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询推荐
     */
    List<SmsHomeRecommendSubject> list(String subjectName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
