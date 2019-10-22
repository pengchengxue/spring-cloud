package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.PmsProductAttributeCategoryItem;
import com.macro.mall.tiny.mbg.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * @Description:    商品属性分类Service
 * @Author:         pcx
 * @CreateDate:     2019/8/9 20:26
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 20:26
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductAttributeCategoryService {

    /**
    * 创建商品属性分类
    * @author      pcx
    * @param name 商品属性name
    * @return
    * @exception
    * @date        2019/8/9 20:28
    */
    int create(String name);
    /**
     * 更新商品属性分类
     * @author      pcx
     * @param id   商品属性Id
     * @param name   商品属性name
     * @return
     * @exception
     * @date        2019/8/9 20:28
     */
    int update(Long id, String name);
    /**
     * 删除商品属性分类
     * @author      pcx
     * @param id   商品属性Id
     * @return
     * @exception
     * @date        2019/8/9 20:28
     */
    int delete(Long id);

    /**
     * 根据Id获取商品属性分类
     * @author      pcx
     * @param id   商品属性Id
     * @return
     * @exception
     * @date        2019/8/9 20:28
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分页获取全部商品属性分类
     * @author      pcx
     * @param pageSize
     * @param pageNum
     * @return
     * @exception
     * @date        2019/8/9 20:28
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     *   获取商品属性 List
     * @author      pcx
     * @param null
     * @return
     * @exception
     * @date        2019/8/9 20:30
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
