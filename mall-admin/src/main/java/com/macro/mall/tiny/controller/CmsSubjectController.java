package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.CmsSubject;
import com.macro.mall.tiny.service.CmsSubjectService;
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
 * @Description: 商品专题Controller
 * @Author: pcx
 * @CreateDate: 2019/8/21 22:26
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/21 22:26
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
@Api(tags = "CmsSubjectController", description = "商品专题管理")
@RequestMapping("/subject")
public class CmsSubjectController {
    @Autowired
    private CmsSubjectService subjectService;

    @ApiOperation("获取全部商品专题")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody()
    public CommonResult<List<CmsSubject>> listAll() {
        List<CmsSubject> cmsSubjectList = subjectService.listAll();
        return CommonResult.success(cmsSubjectList);
    }

    @ApiOperation("根据专题名称分页获取专题")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<CmsSubject>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize) {
        List<CmsSubject> cmsSubjectList = subjectService.list(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(cmsSubjectList));
    }
}
