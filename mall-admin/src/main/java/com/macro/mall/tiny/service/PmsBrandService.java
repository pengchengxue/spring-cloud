package com.macro.mall.tiny.service;


import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * PmsBrandService
 * Created by macro on 2019/4/19.
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(String keyword,int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

    /**
    * 更新品牌的状态
    * @author      pcx
    * @param null
    * @return      
    * @exception   
    * @date        2019/8/9 17:38
    */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
    * 更新厂家制造商状态
    * @author      pcx
    * @param null
    * @return
    * @exception
    * @date        2019/8/9 17:43
    */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
