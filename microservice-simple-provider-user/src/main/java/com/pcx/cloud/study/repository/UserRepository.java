package com.pcx.cloud.study.repository;

import com.pcx.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description: 用户类接口
 * @Author: pcx
 * @CreateDate: 2019/7/30 0:46
 * @UpdateUser: pcx
 * @UpdateDate: 2019/7/30 0:46
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
    * 根据用户名查询用户列表
    * @author      pcx
    * @param List<User>
    * @return      
    * @exception   
    * @date        2019/7/30 1:04
    */
    List<User> findByUsernameLike(String username);

}
