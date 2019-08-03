package com.pcx.cloud.study.feign;

import com.pcx.cloud.study.user.entity.User;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;


/**
 * @Description:    Feign使用Hystrix
 * @Author:         pcx
 * @CreateDate:     2019/8/1 21:44
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/1 21:44
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Component

public class UserFeignClientFallback implements UserFeignClient {


    @Override
    public User findById(Long id) {
        return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
    }

    @Override
    public User get2(Map<String, Object> map) {
        return null;
    }

    @Override
    public User post(User user) {
        return null;
    }
}
