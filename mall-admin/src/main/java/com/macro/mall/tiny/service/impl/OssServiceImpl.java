package com.macro.mall.tiny.service.impl;


import cn.hutool.json.JSONUtil;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.common.utils.StringUtils;
import com.aliyun.oss.model.*;
import com.macro.mall.tiny.dto.OssCallbackParam;
import com.macro.mall.tiny.dto.OssCallbackResult;
import com.macro.mall.tiny.dto.OssPolicyResult;
import com.macro.mall.tiny.service.OssService;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:    oss上传管理Service实现类
 * @Author:         pcx
 * @CreateDate:     2019/8/5 16:15
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 16:15
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class OssServiceImpl implements OssService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OssServiceImpl.class);

    @Value("${aliyun.oss.policy.expire}")
    private int ALIYUN_OSS_EXPIRE;//签名有效期(S)

    @Value("${aliyun.oss.maxSize}")
    private int ALIYUN_OSS_MAX_SIZE;//上传文件大小(M)

    @Value("${aliyun.oss.callback}")
    private String ALIYUN_OSS_CALLBACK;//文件上传成功后的回调地址

    @Value("${aliyun.oss.bucketName}")
    private String ALIYUN_OSS_BUCKET_NAME;//oss的存储空间

    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;// oss对外服务的访问域名

    @Value("${aliyun.oss.dir.prefix}")
    private String ALIYUN_OSS_DIR_PREFIX;//上传文件夹路径前缀

    @Autowired
    private OSSClient ossClient;


    /**
     * 签名生成
     */
    @Override
    public OssPolicyResult policy() {
        OssPolicyResult result = new OssPolicyResult();
        // 存储目录
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        String dir = ALIYUN_OSS_DIR_PREFIX+sdf.format(new Date());
        // 签名有效期
        long expireEndTime = System.currentTimeMillis() + ALIYUN_OSS_EXPIRE * 1000;
        Date expiration = new Date(expireEndTime);
        // 文件大小
        long maxSize = ALIYUN_OSS_MAX_SIZE * 1024 * 1024;
        // 回调
        OssCallbackParam callback = new OssCallbackParam();
        callback.setCallbackUrl(ALIYUN_OSS_CALLBACK);
        callback.setCallbackBody("filename=${object}&size=${size}&mimeType=${mimeType}&height=${imageInfo.height}&width=${imageInfo.width}");
        callback.setCallbackBodyType("application/x-www-form-urlencoded");
        // 提交节点
        String action = "http://" + ALIYUN_OSS_BUCKET_NAME + "." + ALIYUN_OSS_ENDPOINT;
        try {
            // 设置存储空间的访问权限为私有。
        //    ossClient.setBucketAcl(ALIYUN_OSS_BUCKET_NAME, CannedAccessControlList.PublicRead);

            PolicyConditions policyConds = new PolicyConditions();
            policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, maxSize);

            policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);

            String postPolicy = ossClient.generatePostPolicy(expiration, policyConds);

            byte[] binaryData = postPolicy.getBytes("utf-8");

            String policy = BinaryUtil.toBase64String(binaryData);

            String signature = ossClient.calculatePostSignature(postPolicy);

            String callbackData = BinaryUtil.toBase64String(JSONUtil.parse(callback).toString().getBytes("utf-8"));
            // 返回结果
            result.setAccessKeyId(ossClient.getCredentialsProvider().getCredentials().getAccessKeyId());
            result.setPolicy(policy);
            result.setSignature(signature);
            result.setDir(dir);
            result.setCallback(callbackData);
            result.setHost(action);
        } catch (Exception e) {
            LOGGER.error("签名生成失败", e);
        }
        return result;
    }

    @Override
    public OssCallbackResult callback(HttpServletRequest request) {
        OssCallbackResult result= new OssCallbackResult();
        String filename = request.getParameter("filename");
        filename = "http://".concat(ALIYUN_OSS_BUCKET_NAME).concat(".").concat(ALIYUN_OSS_ENDPOINT).concat("/").concat(filename);
        result.setFilename(filename);
        result.setSize(request.getParameter("size"));
        result.setMimeType(request.getParameter("mimeType"));
        result.setWidth(request.getParameter("width"));
        result.setHeight(request.getParameter("height"));
        return result;
    }

    @Override
    public String getBucketAcl() {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://"+ALIYUN_OSS_ENDPOINT;
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        // 获取存储空间的访问权限。
        AccessControlList acl = ossClient.getBucketAcl(ALIYUN_OSS_BUCKET_NAME);
        System.out.println();
        return acl.toString();
    }

}
