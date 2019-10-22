package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.OmsOrder;
import com.macro.mall.tiny.mbg.model.OmsOrderItem;
import com.macro.mall.tiny.mbg.model.OmsOrderOperateHistory;
import lombok.Data;

import java.util.List;

/**
 * @Description: 订单详情信息
 * @Author: pcx
 * @CreateDate: 2019/9/18 17:00
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 17:00
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Data
public class OmsOrderDetail extends OmsOrder {


    /**
     * 订单商品信息
     *
     * @author pcx
     * @param null
     * @return
     * @exception
     * @date 2019/9/18 17:06
     */
    private List<OmsOrderItem> orderItemList;

    /**
     * 订单操作记录
     *
     * @author pcx
     * @param null
     * @return
     * @exception
     * @date 2019/9/18 17:06
     */
    private List<OmsOrderOperateHistory> historyList;
}
