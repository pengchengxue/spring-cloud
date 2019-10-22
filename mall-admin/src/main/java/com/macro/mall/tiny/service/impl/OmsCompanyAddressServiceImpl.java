package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.OmsCompanyAddressMapper;
import com.macro.mall.tiny.mbg.model.OmsCompanyAddress;
import com.macro.mall.tiny.mbg.model.OmsCompanyAddressExample;
import com.macro.mall.tiny.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 收货地址管理Service实现类
 * @Author: pcx
 * @CreateDate: 2019/8/22 22:42
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 22:42
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {

    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
