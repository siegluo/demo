package com.example.demo.spi.common.serializer;

import com.ctrip.tour.order.framework.serialization.Serializers;
import com.ctrip.tour.order.train.actionservice.common.clog.LogManager;
import org.apache.commons.lang.StringUtils;

/**
 * Created by xu_yanga on 2017/10/11.
 */
public class JsonUtils {
    public static String toJson(Object object) {
        if (object != null) {
            try {
                return Serializers.gson.toString(object);
            } catch (Exception e) {
                LogManager.getLogger(JsonUtils.class).warn("JsonUtils--序列化异常", object, e, null);
            }
        }
        return null;
    }

    public static <T> T fromJson(String jsonData, Class<T> type) {
        if (StringUtils.isNotBlank(jsonData)) {
            try {
                return Serializers.gson.fromString(jsonData, type);
            } catch (Exception e) {
                LogManager.getLogger(JsonUtils.class).warn("JsonUtils--反序列化异常", jsonData, e, null);
            }
        }
        return null;
    }

    public static <T> T fromJson(String jsonData, java.lang.reflect.Type type) {
        if (StringUtils.isNotBlank(jsonData)) {
            try {
                return Serializers.gson.fromGenericString(jsonData, type);
            } catch (Exception e) {
                LogManager.getLogger(JsonUtils.class).error("JsonUtils--反序列化异常", jsonData, e, null);
            }
        }
        return null;
    }
}
