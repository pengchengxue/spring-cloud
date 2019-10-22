package com.macro.mall.tiny.service;

import com.aliyun.oss.model.AccessControlList;
import com.macro.mall.tiny.dto.OssCallbackResult;
import com.macro.mall.tiny.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:    OSS业务接口OssService
 * @Author:         pcx
 * @CreateDate:     2019/8/5 16:14
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 16:14
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */

public interface OssService {

    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);

    /**
    * 获取存储空间的访问权限
    * @author      pcx
    * @param null
    * @return      
    * @exception   
    * @date        2019/8/7 16:06
    */
    String getBucketAcl();
    




}
