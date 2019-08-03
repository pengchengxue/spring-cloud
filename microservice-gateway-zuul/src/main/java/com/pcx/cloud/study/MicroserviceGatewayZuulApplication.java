package com.pcx.cloud.study;

import com.pcx.cloud.study.service.TokenFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaClient
@EnableZuulProxy  //微服务网关
//@EnableCircuitBreaker//通用方式使用Hystrix 开启熔断
//@EnableHystrixDashboard  //Hystrix可视化监控数据
//@EnableHystrix//开启断路器
public class MicroserviceGatewayZuulApplication {

    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MicroserviceGatewayZuulApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGatewayZuulApplication.class, args);
        logger.info("「「「「「微服务网关启动完成」」」」」");
    }

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }



}
