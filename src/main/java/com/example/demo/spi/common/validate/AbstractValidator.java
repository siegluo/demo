package com.example.demo.spi.common.validate;


import com.ctrip.tour.order.train.actionservice.common.dto.ActResult;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public abstract class AbstractValidator<TValidatorDto> {
    protected abstract ActResult validate(TValidatorDto validatorDto);
}
