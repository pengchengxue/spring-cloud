package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 优惠券管理自定义查询Dao
 * @Author: pcx
 * @CreateDate: 2019/10/16 17:53
 * @UpdateUser: pcx
 * @UpdateDate: 2019/10/16 17:53
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface SmsCouponDao {

    /**
     * 获取优惠券信息
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/10/16 17:53
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
