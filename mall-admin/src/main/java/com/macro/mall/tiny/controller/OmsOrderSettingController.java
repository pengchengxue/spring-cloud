package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.OmsOrderSetting;
import com.macro.mall.tiny.service.OmsOrderSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:    订单设置管理
 * @Author:         pcx
 * @CreateDate:     2019/8/22 21:20
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/22 21:20
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Controller
@Api(tags = "OmsOrderSettingController",description = "订单设置管理")
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {

    @Autowired
    private OmsOrderSettingService omsOrderSettingService;

    @ApiOperation("获取指定订单设置")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getItem(@PathVariable Long id){
        OmsOrderSetting omsOrderSetting = omsOrderSettingService.getItem(id);
        return CommonResult.success(omsOrderSetting);
    }

    @ApiOperation("修改指定订单设置")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id,@RequestBody OmsOrderSetting omsOrderSetting){
        int count = omsOrderSettingService.update(id, omsOrderSetting);
        if (count>0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }


}
