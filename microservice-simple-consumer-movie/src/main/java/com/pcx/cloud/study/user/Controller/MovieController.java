package com.pcx.cloud.study.user.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.pcx.cloud.study.feign.UserFeignClient;
import com.pcx.cloud.study.user.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/movies")
@RestController
public class MovieController {

    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private UserFeignClient userFeignClient;

    private AtomicInteger sn = new AtomicInteger(0);

    /**
     * 使用@HystrixCommand 注解，就可保护该API。这里的”保护“，其实带有三层含义——”超时机制“、”仓壁模式“、”断路器“！
     *  fallbackMethod 指定了一个降级方法，如不指定，Hystrix会有一个默认的降级方案，那就是抛异常
     */
  //  @HystrixCommand    // 如果需要进行性能监控，那么必须要有此注解
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
    @PostMapping(value = "/post")
    public User post(@RequestBody User user){
        return this.userFeignClient.post(user);
    }

    /**
     * findById接口降级方法
     * 测试是否进入此方法：
     * 启动microservice-discovery-eureka
     *
     * 启动microservice-provider-user
     *
     * 启动microservice-consumer-movie-ribbon-hystrix-common
     *
     * 访问http://localhost:8010/movies/users/1 ，能正常返回结果
     *
     * 关闭microservice-provider-user ，再次访问http://localhost:8010/movies/users/1 ，可返回类似如下结果，说明当服务提供者时，服务消费者进入了回退方法。
     *
     * http://localhost:8010/actuator/health
     * 没有达到Hystrix的阈值 是触发不了断路器的，至少API错误次数超过20次
     * @param id
     * @return User
     */
    public User findByIdFallback(Long id, Throwable throwable) {
        logger.error("进入回退方法", throwable);
        return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
    }
}
