package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 订单操作记录自定义Dao
 * @Author: pcx
 * @CreateDate: 2019/9/18 17:42
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 17:42
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface OmsOrderOperateHistoryDao {
    /**
     * 插入订单操作记录
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/9/18 17:46
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
