package com.example.demo.spi.common.serializer;

import com.ctrip.tour.order.framework.util.StringUtil;
import com.ctriposs.baiji.rpc.common.formatter.JsonContentFormatter;
import com.ctriposs.baiji.specific.SpecificRecord;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by xu_yanga on 2017/10/17.
 */
public class BajjiJsonUtils {

    public static <T extends SpecificRecord> String toStr(T obj) {
        String result = "";
        if (obj != null) {
            JsonContentFormatter formatter = new JsonContentFormatter();
            try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
                formatter.serialize(os, obj);
                result = os.toString("utf-8");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        return result;
    }

    public static <T extends SpecificRecord> T fromStr(String serializedString, Class<T> classOfT) {
        T resultObj = null;
        if (!StringUtil.isNullOrEmpty(serializedString)) {
            try {
                byte[] bytes = serializedString.getBytes("utf-8");
                JsonContentFormatter formatter = new JsonContentFormatter();
                try (ByteArrayInputStream is = new ByteArrayInputStream(bytes)) {
                    resultObj = formatter.deserialize(classOfT, is);
                } catch (Exception ex) {
                    throw ex;
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        return resultObj;
    }
}
