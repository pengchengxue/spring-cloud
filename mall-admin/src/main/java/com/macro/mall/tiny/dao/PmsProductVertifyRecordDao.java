package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description:    商品审核日志自定义dao
 * @Author:         pcx
 * @CreateDate:     2019/8/21 20:46
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 20:46
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductVertifyRecordDao {

    /**
    * 批量插入商品审核日志
    * @author      pcx
    * @param List<PmsProductVertifyRecord> list
    * @return      
    * @exception   
    * @date        2019/8/21 20:48
    */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);



}
