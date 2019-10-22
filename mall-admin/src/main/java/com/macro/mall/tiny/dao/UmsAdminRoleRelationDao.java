package com.macro.mall.tiny.dao;


import com.macro.mall.tiny.mbg.model.UmsAdminRoleRelation;
import com.macro.mall.tiny.mbg.model.UmsPermission;
import com.macro.mall.tiny.mbg.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:    后台用户与角色管理自定义Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/4 15:34
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/4 15:34
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface UmsAdminRoleRelationDao {


    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     * @author      pcx
     * @param adminId
     * @return
     * @exception
     * @date        2019/8/4 15:34
     */


    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

}
