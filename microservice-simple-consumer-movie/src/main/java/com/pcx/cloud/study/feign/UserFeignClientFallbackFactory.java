package com.pcx.cloud.study.feign;

import com.pcx.cloud.study.user.entity.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Hystrix 客户端回退机制类。
 *
 * 这里加上注解 Component 的目的：就是因为没有这个注解，运行时候会报错，报错会说没有该类的这个实例，所以我们就想到要实例化这个类，因此加了这个注解。
 *
 * 获得造成fallback的原因
 * @author      pcx
 * @param UserFeignClient
 * @return
 * @exception
 * @date        2019/8/1 21:49
 */

@Component
public class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(UserFeignClientFallbackFactory.class);
    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                logger.error("进入回退逻辑", throwable);
                return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
            }
            @Override
            public User get2(Map<String, Object> map) {
                logger.error("进入回退逻辑", throwable);
                return null;
            }
            @Override
            public User post(User user) {
                logger.error("进入回退逻辑", throwable);
                return null;
            }
        };
    }
}
