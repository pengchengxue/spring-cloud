package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.PmsProductCategoryParam;
import com.macro.mall.tiny.dto.PmsProductCategoryWithChildrenItem;
import com.macro.mall.tiny.mbg.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:    产品分类Service
 * @Author:         pcx
 * @CreateDate:     2019/8/9 19:28
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 19:28
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductCategoryService {

    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    int delete(Long id);

    PmsProductCategory getItem(Long id);

    /**
    * 方法实现说明
    * @author      pcx
    * @param null
    * @return      
    * @exception   
    * @date        2019/8/9 20:10
    */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    List<PmsProductCategoryWithChildrenItem> listWithChildren();

}
