package com.macro.mall.tiny.dto;

import lombok.Data;

/**
 * @Description:     Controller层的日志封装类
 * @Author:         pcx
 * @CreateDate:     2019/8/6 0:18
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/6 0:18
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Data
public class WebLog {

    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private Long startTime;

    /**
     * 消耗时间
     */
    private Integer spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 请求参数
     */
    private Object parameter;

    /**
     * 请求返回的结果
     */
    private Object result;


}
