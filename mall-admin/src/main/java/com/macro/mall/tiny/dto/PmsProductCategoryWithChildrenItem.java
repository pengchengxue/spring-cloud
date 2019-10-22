package com.macro.mall.tiny.dto;

import com.macro.mall.tiny.mbg.model.PmsProductCategory;
import lombok.Data;

import java.util.List;

/**
 * Created by macro on 2018/5/25.
 */
@Data
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {

    private List<PmsProductCategory> children;


}
