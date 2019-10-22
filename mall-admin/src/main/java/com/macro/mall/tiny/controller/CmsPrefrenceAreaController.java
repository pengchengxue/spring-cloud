package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.CmsPrefrenceArea;
import com.macro.mall.tiny.service.CmsPrefrenceAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 商品优选管理Controller
 * @Author: pcx
 * @CreateDate: 2019/8/21 23:06
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 23:06
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
@Api(tags = "CmsPrefrenceAreaController",description = "商品优选管理")
@RequestMapping(value = "/prefrenceArea")
public class CmsPrefrenceAreaController {

    @Autowired
    private CmsPrefrenceAreaService cmsPrefrenceAreaService;

    @ApiOperation("获取所有商品优选")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CmsPrefrenceArea>> listAll(){
        List<CmsPrefrenceArea> prefrenceAreaList = cmsPrefrenceAreaService.listAll();
        return CommonResult.success(prefrenceAreaList);
    }


}
