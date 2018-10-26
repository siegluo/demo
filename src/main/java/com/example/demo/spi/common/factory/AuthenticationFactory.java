package com.example.demo.spi.common.factory;

import com.ctrip.soa.train.ordercoreservice.train.v1.AuthenticationV2;
import com.ctrip.tour.order.train.actionservice.core.constants.Constants;
import com.ctrip.tour.order.train.actionservice.core.suborder.suborderkey.MessageIdentityUtils;
import org.springframework.stereotype.Component;

/**
 * Created by Sun Xingbin on 2017/10/17.
 */

@Component
public class AuthenticationFactory {

    public AuthenticationV2 createByServiceName(String serviceName) {
        try {
            long timeStamp = System.currentTimeMillis();
            AuthenticationV2 authenticationV2 = new AuthenticationV2();
            authenticationV2.setTimeStamp(String.valueOf(timeStamp));
            authenticationV2.setMessageIdentity(MessageIdentityUtils.getMessageIdentity(timeStamp));
            authenticationV2.setPartnerName(Constants.PartnerName);
            authenticationV2.setServiceName(serviceName);
            return authenticationV2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
