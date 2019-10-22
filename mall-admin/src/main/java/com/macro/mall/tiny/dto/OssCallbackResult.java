package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:    OSS上传成功后的回调结果对象OssCallbackResult,oss上传文件的回调结果
 * @Author:         pcx
 * @CreateDate:     2019/8/5 16:13
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 16:13
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class OssCallbackResult {

    @ApiModelProperty("文件名称")
    private String filename;
    @ApiModelProperty("文件大小")
    private String size;
    @ApiModelProperty("文件的mimeType")
    private String mimeType;
    @ApiModelProperty("图片文件的宽")
    private String width;
    @ApiModelProperty("图片文件的高")
    private String height;

}
