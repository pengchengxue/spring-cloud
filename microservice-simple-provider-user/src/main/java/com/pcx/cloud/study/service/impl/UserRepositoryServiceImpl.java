package com.pcx.cloud.study.service.impl;

import com.pcx.cloud.study.entity.User;
import com.pcx.cloud.study.repository.UserRepository;
import com.pcx.cloud.study.service.UserRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findByUsernameLike(String username) {
        return userRepository.findByUsernameLike(username);
    }

}
