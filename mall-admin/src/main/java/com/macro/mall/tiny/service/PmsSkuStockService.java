package com.macro.mall.tiny.service;


import com.macro.mall.tiny.mbg.model.PmsSkuStock;

import java.util.List;

/**
 * @Description: sku商品库存管理Service
 * @Author: pcx
 * @CreateDate: 2019/8/22 0:35
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 0:35
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface PmsSkuStockService {

    /**
     * 根据产品id和skuCode模糊搜索
     *
     * @param Long pid 商品id
     * @param String keyword 关键字
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/22 0:35
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品库存信息
     *
     * @param Long pid 商品id
     * @param List<PmsSkuStock> skuStockList skuList
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/22 0:35
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
