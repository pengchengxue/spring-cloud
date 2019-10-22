package com.macro.mall.tiny.dao;
import com.macro.mall.tiny.mbg.model.UmsPermission;
import com.macro.mall.tiny.mbg.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description:    后台用户角色管理自定义Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/5 17:22
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 17:22
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface UmsRolePermissionRelationDao {

    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
