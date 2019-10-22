package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description:    自定义会员阶梯价格Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/21 23:27
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 23:27
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsProductLadderDao {

    /**
    * 批量插入会员阶梯价格Dao
    * @author      pcx
    * @param null
    * @return      
    * @exception   
    * @date        2019/8/21 23:28
    */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);


}
