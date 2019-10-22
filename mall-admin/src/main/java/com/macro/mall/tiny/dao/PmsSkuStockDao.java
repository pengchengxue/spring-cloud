package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.PmsSkuStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 自定义商品sku库存Dao
 * @Author: pcx
 * @CreateDate: 2019/8/21 23:32
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 23:32
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface PmsSkuStockDao {

    /**
     * 批量插入操作
     *
     * @param  List<PmsSkuStock> skuStockList
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/21 23:32
     */
    int insertList(@Param("list") List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替换操作
     *
     * @param List<PmsSkuStock> skuStockList
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/21 23:32
     */
    int replaceList(@Param("list") List<PmsSkuStock> skuStockList);
}
