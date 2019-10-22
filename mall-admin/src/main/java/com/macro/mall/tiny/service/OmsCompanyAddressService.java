package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * @Description: 收货地址管Service
 * @Author: pcx
 * @CreateDate: 2019/8/22 22:41
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 22:41
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface OmsCompanyAddressService {

    /**
     * 获取全部收货地址
     *
     * @param null
     * @return
     * @throws
     * @author pcx
     * @date 2019/8/22 22:41
     */
    List<OmsCompanyAddress> list();
}
