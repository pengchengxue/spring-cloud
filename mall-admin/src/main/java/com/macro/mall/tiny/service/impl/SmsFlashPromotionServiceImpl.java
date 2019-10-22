package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.mbg.mapper.SmsFlashPromotionMapper;
import com.macro.mall.tiny.mbg.model.SmsFlashPromotion;
import com.macro.mall.tiny.mbg.model.SmsFlashPromotionExample;
import com.macro.mall.tiny.service.SmsFlashPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Description: 限时购活动管理Service实现类
 * @Author: pcx
 * @CreateDate: 2019/9/18 18:29
 * @UpdateUser: pcx
 * @UpdateDate: 2019/9/18 18:29
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService {

    @Autowired
    private SmsFlashPromotionMapper smsFlashPromotionMapper;

    @Override
    public int create(SmsFlashPromotion flashPromotion) {
        flashPromotion.setCreateTime(new Date());
        return smsFlashPromotionMapper.insert(flashPromotion);
    }

    @Override
    public int update(Long id, SmsFlashPromotion flashPromotion) {
        flashPromotion.setId(id);
        return smsFlashPromotionMapper.updateByPrimaryKey(flashPromotion);
    }

    @Override
    public int delete(Long id) {
        return smsFlashPromotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateStatus(Long id, Integer status) {
        SmsFlashPromotion promotion =new SmsFlashPromotion();
        promotion.setId(id);
        promotion.setStatus(status);
        return smsFlashPromotionMapper.updateByPrimaryKeySelective(promotion);
    }

    @Override
    public SmsFlashPromotion getItem(Long id) {
        return smsFlashPromotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsFlashPromotionExample example = new SmsFlashPromotionExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andTitleLike("%" + keyword + "%");
        }
        return smsFlashPromotionMapper.selectByExample(example);
    }
}
