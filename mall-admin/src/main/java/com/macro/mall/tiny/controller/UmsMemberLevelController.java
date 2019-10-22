package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.UmsMemberLevel;
import com.macro.mall.tiny.service.UmsMemberLevelService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 会员等级管理Controller
 * @Author: pcx
 * @CreateDate: 2019/8/21 23:56
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 23:56
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
@Api(tags = "UmsMemberLevelController", description = "会员等级管理")
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {
    @Autowired
    private UmsMemberLevelService memberLevelService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation("查询所有会员等级")
    @ResponseBody
    public CommonResult<List<UmsMemberLevel>> list(@RequestParam("defaultStatus") Integer defaultStatus) {
        List<UmsMemberLevel> memberLevelList = memberLevelService.list(defaultStatus);
        return CommonResult.success(memberLevelList);
    }


}
