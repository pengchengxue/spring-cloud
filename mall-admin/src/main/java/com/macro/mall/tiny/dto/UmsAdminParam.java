package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Description:    用户登录参数
 * @Author:         pcx
 * @CreateDate:     2019/8/5 17:17
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 17:17
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class UmsAdminParam {

    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "备注")
    private String note;



}
