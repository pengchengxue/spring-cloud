package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.SmsHomeRecommendProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:    首页人气推荐管理Service
 * @Author:         pcx
 * @CreateDate:     2019/10/16 22:33
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/10/16 22:33
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface SmsHomeRecommendProductService {
    /**
     * 添加首页推荐
     */
    @Transactional
    int create(List<SmsHomeRecommendProduct> homeRecommendProductList);

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
    List<SmsHomeRecommendProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
