package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.dao.PmsSkuStockDao;
import com.macro.mall.tiny.mbg.mapper.PmsSkuStockMapper;
import com.macro.mall.tiny.mbg.model.PmsSkuStock;
import com.macro.mall.tiny.mbg.model.PmsSkuStockExample;
import com.macro.mall.tiny.service.PmsSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Description: 商品sku库存管理Service实现类
 * @Author: pcx
 * @CreateDate: 2019/8/22 0:37
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 0:37
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService {

    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsSkuStockDao skuStockDao;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return skuStockDao.replaceList(skuStockList);
    }
}
