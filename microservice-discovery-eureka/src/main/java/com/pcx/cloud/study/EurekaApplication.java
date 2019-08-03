package com.pcx.cloud.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:    服务注册与服务发现，使用 这个注解 @EnableEurekaServer
 *                  Eureka集群部署：命令
 *                  java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=eureka1
 *                  eureka1 :
 *                  vim /etc/hosts
 *                  添加如下内容
 *                  127.0.0.1 node1 node2
 *                  对于Windows系统，请修改C:\windows\system32\drivers\etc\hosts文件
 *                   127.0.0.1       eureka1
 *                   127.0.0.1       eureka2
 *
 * @Author:         pcx
 * @CreateDate:     2019/7/30 21:31
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/7/30 21:31
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(EurekaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        logger.info("「「「「「Eureka服务注册中心启动完成」」」」」");
    }

}
