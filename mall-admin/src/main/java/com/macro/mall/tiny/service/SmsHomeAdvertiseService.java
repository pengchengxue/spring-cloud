package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.SmsHomeAdvertise;

import java.util.List;

/**
 * @Description:    首页广告管理Service
 * @Author:         pcx
 * @CreateDate:     2019/10/16 22:31
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/10/16 22:31
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface SmsHomeAdvertiseService {
    /**
     * 添加广告
     */
    int create(SmsHomeAdvertise advertise);

    /**
     * 批量删除广告
     */
    int delete(List<Long> ids);

    /**
     * 修改上、下线状态
     */
    int updateStatus(Long id, Integer status);

    /**
     * 获取广告详情
     */
    SmsHomeAdvertise getItem(Long id);

    /**
     * 更新广告
     */
    int update(Long id, SmsHomeAdvertise advertise);

    /**
     * 分页查询广告
     */
    List<SmsHomeAdvertise> list(String name, Integer type, String endTime, Integer pageSize, Integer pageNum);
}
