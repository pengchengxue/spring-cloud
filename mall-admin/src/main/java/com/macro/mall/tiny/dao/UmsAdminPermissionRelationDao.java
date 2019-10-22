package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.mbg.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:    用户权限自定义Dao
 * @Author:         pcx
 * @CreateDate:     2019/8/5 17:24
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 17:24
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface UmsAdminPermissionRelationDao {

    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
