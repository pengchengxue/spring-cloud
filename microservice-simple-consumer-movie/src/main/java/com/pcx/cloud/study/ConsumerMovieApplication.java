package com.pcx.cloud.study;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:    电影微服务
 * Hystrix可视化监控数据使用方式 ：
 *访问：http://localhost:8010/hystrix
 * 输入   http://localhost:8010/actuator/hystrix.stream 和  microserviceConsumerMovie
 * 点击 Monitor Stream 按钮
 *
 *
 * @Author:         pcx
 * @CreateDate:     2019/7/30 21:43
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/7/30 21:43
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@SpringBootApplication
@EnableEurekaClient //EurekaClient
@EnableFeignClients //整合注入Feign
@EnableCircuitBreaker//通用方式使用Hystrix 开启熔断
@EnableHystrixDashboard  //Hystrix可视化监控数据
@EnableHystrix//开启断路器
public class ConsumerMovieApplication {

    /**
    *           负载均衡的实现
    *           RestTemplate整合Ribbon  使用注解 @LoadBalanced
    *           由于spring-cloud-starter-netflix-eureka-client 已经包含spring-cloud-starter-netfilx-ribbon ，
    *           故而无需额外添加依赖。
    * @author      pcx
    * @return
    * @exception
    * @date        2019/7/31 0:53
    */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(ConsumerMovieApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieApplication.class, args);
        logger.info("「「「「「电影服务注册中心启动完成」」」」」");
    }

}
