package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * @Description:    自定义商品属性分类Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/9 20:37
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 20:37
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductAttributeCategoryDao {

    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
