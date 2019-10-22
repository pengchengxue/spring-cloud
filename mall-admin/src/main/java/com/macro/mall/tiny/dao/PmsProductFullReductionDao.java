package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 自定义商品满减Dao
 * @Author: pcx
 * @CreateDate: 2019/8/21 23:30
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 23:30
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface PmsProductFullReductionDao {

    /**
     * 批量插入商品满减Dao
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/21 23:30
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);

}
