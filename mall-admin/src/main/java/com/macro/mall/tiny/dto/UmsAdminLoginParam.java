package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @Description: 用户登录参数
 * @Author: pcx
 * @CreateDate: 2019/8/4 15:55
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/4 15:55
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class UmsAdminLoginParam {

    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
