package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.dao.PmsProductAttributeCategoryDao;
import com.macro.mall.tiny.dto.PmsProductAttributeCategoryItem;
import com.macro.mall.tiny.mbg.mapper.PmsProductAttributeCategoryMapper;
import com.macro.mall.tiny.mbg.model.PmsProductAttributeCategory;
import com.macro.mall.tiny.mbg.model.PmsProductAttributeCategoryExample;
import com.macro.mall.tiny.service.PmsProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:    PmsProductAttributeCategoryService实现类
 * @Author:         pcx
 * @CreateDate:     2019/8/9 20:36
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 20:36
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {

    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;
    @Autowired
    private PmsProductAttributeCategoryDao productAttributeCategoryDao;

    @Override
    public int create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        return productAttributeCategoryMapper.insertSelective(productAttributeCategory);
    }

    @Override
    public int update(Long id, String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        productAttributeCategory.setId(id);
        return productAttributeCategoryMapper.updateByPrimaryKeySelective(productAttributeCategory);
    }

    @Override
    public int delete(Long id) {
        return productAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return productAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return productAttributeCategoryMapper.selectByExample(new PmsProductAttributeCategoryExample());
    }

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return productAttributeCategoryDao.getListWithAttr();
    }
}
