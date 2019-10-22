package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.dto.OmsOrderReturnApplyResult;
import com.macro.mall.tiny.dto.OmsReturnApplyQueryParam;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:     订单退货申请自定义Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/22 21:45
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 21:45
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface OmsOrderReturnApplyDao {

    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);



}
