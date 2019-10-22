package com.macro.mall.tiny.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:     OSS上传成功后的回调参数对象OssCallbackParam,oss上传成功后的回调参数
 * @Author:         pcx
 * @CreateDate:     2019/8/5 16:11
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 16:11
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class OssCallbackParam {

    @ApiModelProperty("请求的回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;


}
