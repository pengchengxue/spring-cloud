package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Description:    自定义商品和专题关系操作
 * @Author:         pcx
 * @CreateDate:     2019/8/21 23:38
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 23:38
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface CmsSubjectProductRelationDao {
    /**
    * 批量插入商品和专题关系操作
    * @author      pcx
    * @param null
    * @return      
    * @exception   
    * @date        2019/8/21 23:38
    */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
