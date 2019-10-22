package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.OmsOrderReturnReason;
import com.macro.mall.tiny.service.OmsOrderReturnReasonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 退货原因管理
 * @Author: pcx
 * @CreateDate: 2019/8/22 23:12
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/22 23:12
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
@RequestMapping("/returnReason")
@Api(tags = "OmsOrderReturnReasonController", description = "退货原因管理")
public class OmsOrderReturnReasonController {

    @Autowired
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    @ApiOperation("添加退货原因")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        int count = omsOrderReturnReasonService.create(omsOrderReturnReason);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改退货原因")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id, @RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        int count = omsOrderReturnReasonService.update(id, omsOrderReturnReason);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量删除退货原因")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = omsOrderReturnReasonService.delete(ids);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("分页查询全部退货原因")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<OmsOrderReturnReason>> list(@RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                                               @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<OmsOrderReturnReason> reasonList = omsOrderReturnReasonService.list(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(reasonList));
    }
    @ApiOperation("获取单个退货原因详情信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrderReturnReason> getItem(@PathVariable Long id) {
        OmsOrderReturnReason reason = omsOrderReturnReasonService.getItem(id);
        return CommonResult.success(reason);
    }

    @ApiOperation("修改退货原因启用状态")
    @RequestMapping(value = "/update/status", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateStatus(@RequestParam(value = "status") Integer status,
                                     @RequestParam("ids") List<Long> ids) {
        int count = omsOrderReturnReasonService.updateStatus(ids, status);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
