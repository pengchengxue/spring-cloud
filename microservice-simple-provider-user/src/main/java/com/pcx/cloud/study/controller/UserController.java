package com.pcx.cloud.study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pcx.cloud.study.ProviderUserApplication;
import com.pcx.cloud.study.entity.User;
import com.pcx.cloud.study.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @Description: 用户类控制器
 * * @Author:         pcx
 * @CreateDate: 2019/7/30 0:53
 * @UpdateUser: pcx
 * @UpdateDate: 2019/7/30 0:53
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RequestMapping("/users")
@RestController
public class UserController {

    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(ProviderUserApplication.class);

    @Autowired
    private UserRepository userRepository;

    @HystrixCommand
    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        logger.info("request id is "+id);

        return this.userRepository.findById(id);
    }


}
