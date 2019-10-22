package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:    自定义会员价格Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/21 23:24
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/21 23:24
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface PmsMemberPriceDao {
    /**
    * 批量插入会员价格
    * @author      pcx
    * @param null
    * @return      
    * @exception   
    * @date        2019/8/21 23:24
    */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);

}
