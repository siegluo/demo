package com.example.demo.spi.common.validate;

import com.ctrip.tour.order.train.actionservice.common.dto.ActResult;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xu_yanga on 2017/2/3.
 */
@Component
public class ComposeValidator {
    private List<AbstractValidator> validators;

    public List<AbstractValidator> getValidators() {
        return validators;
    }

    public void setValidators(List<AbstractValidator> validators) {
        this.validators = validators;
    }

    public ActResult validate(Object validatorDto) {
        if (CollectionUtils.isEmpty(validators)) {
            return ActResult.result();
        }
        for (AbstractValidator validator : validators) {
            ActResult result = validator.validate(validatorDto);
            if (!result.isSucceed()) {
                return result;
            }
        }
        return ActResult.result();
    }
}
