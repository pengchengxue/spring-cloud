package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.OmsCompanyAddress;
import com.macro.mall.tiny.service.OmsCompanyAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:   收货地址管理Controller
 * @Author:         pcx
 * @CreateDate:     2019/8/22 22:44
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 22:44
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Controller
@Api(tags = "OmsCompanyAddressController",description = "收货地址管理")
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {

    @Autowired
    private OmsCompanyAddressService omsCompanyAddressService;

    @ApiOperation("获取所有收货地址")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<OmsCompanyAddress>> list(){
        List<OmsCompanyAddress> list = omsCompanyAddressService.list();
        System.err.println("list");
        return CommonResult.success(list);
    }


}
