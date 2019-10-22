package com.macro.mall.tiny.config;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Description:    OSS的相关Java配置
 * @Author:         pcx
 * @CreateDate:     2019/8/5 16:09
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 16:09
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Configuration
public class OssConfig {

    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;//oss对外服务的访问域名

    @Value("${aliyun.oss.accessKeyId}")
    private String ALIYUN_OSS_ACCESSKEYID;//访问身份验证中用到用户标识

    @Value("${aliyun.oss.accessKeySecret}")
    private String ALIYUN_OSS_ACCESSKEYSECRET;//用户用于加密签名字符串和oss用来验证签名字符串的密钥

    @Value("${aliyun.oss.dir.prefix}")
    private  String ALIYUN_OSS_FILE_HOST;//上传文件夹路径前缀

    @Value("${aliyun.oss.bucketName}")
    private  String ALIYUN_OSS_BUCKET_NAME;//oss的存储空间



    @Bean
    public OSSClient ossClient(){
        return new OSSClient(ALIYUN_OSS_ENDPOINT,ALIYUN_OSS_ACCESSKEYID,ALIYUN_OSS_ACCESSKEYSECRET);
    }


}
