package com.macro.mall.tiny.controller;


import com.aliyun.oss.model.AccessControlList;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.dto.OssCallbackResult;
import com.macro.mall.tiny.dto.OssPolicyResult;
import com.macro.mall.tiny.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @Description:   Oss相关操作接口
 * @Author:         pcx
 * @CreateDate:     2019/8/5 16:16
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 16:16
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Controller
@Api(tags = "OssController", description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {

    @Autowired
    private OssServiceImpl ossService;

    @ApiOperation(value = "oss上传签名生成")
    @RequestMapping(value = "/policy", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OssPolicyResult> policy() {
        OssPolicyResult result = ossService.policy();
        return CommonResult.success(result);
    }

    @ApiOperation(value = "oss上传成功回调")
    @RequestMapping(value = "callback", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<OssCallbackResult> callback(HttpServletRequest request) {
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        return CommonResult.success(ossCallbackResult);
    }

    @ApiOperation(value = "获取oss存储空间的访问权限")
    @RequestMapping(value = "getBucketAcl", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> getBucketAcl() {
        String acl = ossService.getBucketAcl();

        return CommonResult.success(acl);
    }


}
