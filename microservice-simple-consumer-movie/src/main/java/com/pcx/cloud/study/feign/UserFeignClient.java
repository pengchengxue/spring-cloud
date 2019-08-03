package com.pcx.cloud.study.feign;

import com.pcx.cloud.study.user.Controller.MovieController;
import com.pcx.cloud.study.user.entity.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

/**
*  UserFeignClient
 * fallback/fallbackFactory  只能选择一个使用
* @author      pcx
* @param null
* @return
* @exception
* @date        2019/8/1 23:10
*/
@FeignClient(name = "microserviceProviderUser", configuration = UserFeignConfig.class, /* fallback = UserFeignClientFallback.class */ fallbackFactory =UserFeignClientFallbackFactory.class)
public interface UserFeignClient {


    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MovieController.class);


    @GetMapping("/users/{id}")

    User findById(@PathVariable Long id);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    User get2(@RequestParam Map<String, Object> map);

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    User post(@RequestBody User user);




}
