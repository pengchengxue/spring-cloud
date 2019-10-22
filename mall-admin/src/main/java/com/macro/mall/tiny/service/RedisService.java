package com.macro.mall.tiny.service;

/**
 * @Description: redis操作Service, 对象和数组都以json形式进行存储
 * @Author: pcx
 * @CreateDate: 2019/8/4 14:48
 * @UpdateUser: pcx
 * @UpdateDate: 2019/8/4 14:48
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface RedisService {


    /**
     * 存储数据
     *
     * @param key 键
     * @param value 值
     * @return void
     * @throws
     * @author pcx
     * @date 2019/8/4 15:00
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     *
     * @param delta 自增步长
     */
    Long increment(String key, long delta);

}
