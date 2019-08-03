package com.pcx.cloud.study.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;


/**
 * 该Feign Client的配置类，注意：
 * 1. 该类可以独立出去；
 * 2. 该类上也可添加@Configuration声明是一个配置类；
 * 配置类上也可添加@Configuration注解，声明这是一个配置类；
 * 但此时千万别将该放置在主应用程序上下文@ComponentScan所扫描的包中，
 * 否则，该配置将会被所有Feign Client共享，无法实现细粒度配置！
 * 个人建议：不加@Configuration注解
 * @Author:         pcx
 * @CreateDate:     2019/8/1 18:53
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/1 18:53
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class UserFeignConfig {

    @Bean
    public Logger.Level logger() {
        /**
         * NONE【性能最佳，适用于生产】：不记录任何日志（默认值）。
         * BASIC【适用于生产环境追踪问题】：仅记录请求方法、URL、响应状态代码以及执行时间。
         * HEADERS：记录BASIC级别的基础上，记录请求和响应的header。
         * FULL【比较适用于开发及测试环境定位问题】：记录请求和响应的header、body和元数据。
         */
        return Logger.Level.FULL;
    }


}
