package com.macro.mall.tiny.dao;


import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description:    搜索系统中的商品管理自定义Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/4 20:11
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/4 20:11
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
