package com.macro.mall.tiny.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Description:    状态标记校验器
 * @Author:         pcx
 * @CreateDate:     2019/8/9 19:48
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/9 19:48
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class FlagValidatorClass implements ConstraintValidator<FlagValidator,Integer> {
    private String[] values;
    @Override
    public void initialize(FlagValidator flagValidator) {
        this.values = flagValidator.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        if(value==null){
            //当状态为空时使用默认值
            return true;
        }
        for(int i=0;i<values.length;i++){
            if(values[i].equals(String.valueOf(value))){
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
