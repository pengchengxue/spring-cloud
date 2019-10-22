package com.macro.mall.tiny.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.dto.OrderParam;
import com.macro.mall.tiny.service.OmsPortalOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @Description:    订单管理Controller
 * @Author:         pcx
 * @CreateDate:     2019/8/5 15:36
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 15:36
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Controller
@Api(tags = "OmsPortalOrderController", description = "订单管理")
@RequestMapping("/order")
public class OmsPortalOrderController {

    @Autowired
    private OmsPortalOrderService portalOrderService;

    @ApiOperation("根据购物车信息生成订单")
    @RequestMapping(value = "/generateOrder", method = RequestMethod.POST)
    @ResponseBody
    public Object generateOrder(@RequestBody OrderParam orderParam) {
        return portalOrderService.generateOrder(orderParam);
    }

    @ApiOperation("取消订单")
    @RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult cancelOrder(@RequestParam Long orderId) {
        portalOrderService.cancelOrder(orderId);
        return CommonResult.success("取消订单成功");
    }

}
