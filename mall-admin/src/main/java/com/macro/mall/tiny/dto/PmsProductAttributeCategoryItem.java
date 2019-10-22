package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.PmsProductAttribute;
import com.macro.mall.tiny.mbg.model.PmsProductAttributeCategory;
import lombok.Data;

import java.util.List;

/**
 * @Description:    包含有分类下属性的dto,继承 商品属性分类表
 * @Author:         pcx
 * @CreateDate:     2019/8/9 20:27
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 20:27
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {

    /**
    *   商品属性表 List
    * @author      pcx
    * @param null
    * @return
    * @exception
    * @date        2019/8/9 20:30
    */
    private List<PmsProductAttribute> productAttributeList;



}
