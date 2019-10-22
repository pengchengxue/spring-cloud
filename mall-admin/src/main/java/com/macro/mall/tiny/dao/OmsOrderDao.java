package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.dto.OmsOrderDeliveryParam;
import com.macro.mall.tiny.dto.OmsOrderDetail;
import com.macro.mall.tiny.dto.OmsOrderQueryParam;
import com.macro.mall.tiny.mbg.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 订单自定义查询Dao
 * @Author: pcx
 * @CreateDate: 2019/8/22 0:56
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 0:56
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface OmsOrderDao {

    /**
     * 条件查询订单
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/22 0:56
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/22 0:56
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/22 0:57
     */
    OmsOrderDetail getDetail(@Param("id") Long id);


}
