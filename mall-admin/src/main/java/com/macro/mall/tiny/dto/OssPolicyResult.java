package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.UUID;

/**
 * @Description:     OSS上传策略封装对象OssPolicyResult,获取OSS上传文件授权返回结果
 * @Author:         pcx
 * @CreateDate:     2019/8/5 16:10
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 16:10
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class OssPolicyResult {

    @ApiModelProperty("访问身份验证中用到用户标识")
    private String accessKeyId;
    @ApiModelProperty("用户表单上传的策略,经过base64编码过的字符串")
    private String policy;
    @ApiModelProperty("对policy签名后的字符串")
    private String signature;
    @ApiModelProperty("上传文件夹路径前缀")
    private String dir;
    @ApiModelProperty("oss对外服务的访问域名")
    private String host;
    @ApiModelProperty("上传成功后的回调设置")
    private String callback;
    //自动生成的文件名称
    private String filename= UUID.randomUUID().toString().replaceAll("-","");

}
