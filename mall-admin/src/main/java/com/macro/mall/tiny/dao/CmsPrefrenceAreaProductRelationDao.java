package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 自定义优选和商品关系操作
 * @Author: pcx
 * @CreateDate: 2019/8/21 23:41
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 23:41
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface CmsPrefrenceAreaProductRelationDao {
    /**
     * 批量插入优选和商品关系操作
     *
     * @param List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/21 23:41
     */

    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
