package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @Description:    商品分类自定义Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/9 23:26
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 23:26
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductCategoryDao {

    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
