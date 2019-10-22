package com.macro.mall.tiny.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


/**
 * @Description: 全局跨域配置
 * @Author: pcx
 * @CreateDate: 2019/8/5 17:02
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/5 17:02
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Configuration
public class GlobalCorsConfig {

    /**
    *           允许跨域调用的过滤器
    * @author      pcx
    * @param null
    * @return
    * @exception
    * @date        2019/8/5 17:04
    */

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //允许所有域名进行跨域调用
        config.addAllowedOrigin("*");
        //允许跨越发送cookie
        config.setAllowCredentials(true);
        //放行全部原始头信息
        config.addAllowedHeader("*");
        //允许所有请求方法跨域调用
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
