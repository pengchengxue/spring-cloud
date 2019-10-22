package com.macro.mall.tiny.service;


import com.macro.mall.tiny.mbg.model.PmsProductAttribute;


import com.macro.mall.tiny.dto.PmsProductAttributeParam;
import com.macro.mall.tiny.dto.ProductAttrInfo;
import com.macro.mall.tiny.mbg.model.PmsProductAttribute;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @Description:    java类作用描述
 * @Author:         pcx
 * @CreateDate:     2019/8/9 21:40
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 21:40
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductAttributeService {

    /**
     * 根据分类分页获取商品属性
     * @param cid 分类id
     * @param type 0->属性；2->参数
     * @return
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 添加商品属性
     */
    @Transactional
    int create(PmsProductAttributeParam pmsProductAttributeParam);

    /**
     * 修改商品属性
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * 获取单个商品属性信息
     */
    PmsProductAttribute getItem(Long id);

    /**
    * 删除商品属性
    * @author      pcx
    * @param ids 商品属性ids
    * @return
    * @exception
    * @date        2019/8/9 21:44
    */
    @Transactional
    int delete(List<Long> ids);

    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);



}
