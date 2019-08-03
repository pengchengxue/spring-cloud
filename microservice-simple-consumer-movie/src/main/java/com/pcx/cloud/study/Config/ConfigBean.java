package com.pcx.cloud.study.Config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class ConfigBean {
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }
//
//    @Bean
//    public IRule myRule() {
//        //return new RandomRule(); //随机算法
//        return new RetryRule();//发现服务失败，下次跳过该服务的轮询。
//    }

}
