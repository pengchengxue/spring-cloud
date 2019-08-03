package com.pcx.cloud.study.service;

import com.pcx.cloud.study.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserRepositoryService {

    /**
     * 根据用户名查询用户列表
     *
     * @param List<User>
     * @return
     * @throws
     * @author pcx
     * @date 2019/7/30 1:04
     */
    List<User> findByUsernameLike(String username);


}
