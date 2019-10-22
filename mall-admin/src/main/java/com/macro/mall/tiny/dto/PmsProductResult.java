package com.macro.mall.tiny.dto;

import lombok.Data;

/**
 * @Description: 查询单个产品进行修改时返回的结果
 * @Author: pcx
 * @CreateDate: 2019/8/21 18:41
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 18:41
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class PmsProductResult extends PmsProductParam {

    //商品所选分类的父id
    private Long cateParentId;

}
