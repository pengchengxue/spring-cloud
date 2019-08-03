package com.pcx.cloud.study;

import com.pcx.cloud.study.entity.User;
import com.pcx.cloud.study.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;
/**
 * @Description:    java类作用描述
 * @Author:         pcx
 * @CreateDate:     2019/7/30 0:52
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/7/30 0:52
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //整合注入Feign
@EnableCircuitBreaker//通用方式使用Hystrix 开启熔断
@EnableHystrixDashboard  //Hystrix可视化监控数据
@EnableHystrix//开启断路器
public class ProviderUserApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(ProviderUserApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
        logger.info("「「「「「用户服务注册中心启动完成」」」」」");
    }
    /**
     * 初始化用户信息
     * 注：Spring Boot2不能像1.x一样，用spring.datasource.schema/data指定初始化SQL脚本，否则与actuator不能共存
     * 原因详见：
     * https://github.com/spring-projects/spring-boot/issues/13042
     * https://github.com/spring-projects/spring-boot/issues/13539
     *
     * @param repository repo
     * @return runner
     */
    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            User user1 = new User(1L, "account1", "张三", 20, new BigDecimal(100.00));
            User user2 = new User(2L, "account2", "李四", 28, new BigDecimal(180.00));
            User user3 = new User(3L, "account3", "王五", 32, new BigDecimal(280.00));
            Stream.of(user1, user2, user3).forEach(repository::save);
        };
    }
}
