package com.example.demo.spi.common.utils;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sun Xingbin on 2017/10/17.
 */

@Component
public class LogUtils {

    public Map<String, String> getTagsByOrderId(Long orderId) {
        Map<String, String> tags = new HashMap<>();
        if (orderId != null) {
            tags.put("orderid", orderId.toString());
        }
        return tags;
    }
}
