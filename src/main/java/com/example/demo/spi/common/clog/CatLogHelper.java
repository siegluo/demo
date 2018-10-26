package com.example.demo.spi.common.clog;

import com.ctrip.tour.order.framework.logging.systemlog.LogCat;

/**
 * Created by xu_yanga on 2017/5/24.
 */
public class CatLogHelper {

    public static void writeCatLog(Object request, Object response, String type, String name, Boolean isSuccess, String errorMsg) {
        try {
            LogCat.addData("request", request);
            LogCat.addData("response", response);
            if (isSuccess != null && isSuccess) {
                LogCat.logEvent(type, name);
                LogCat.logSuccess();
            } else {
                LogCat.logFailEvent(type, name);
                LogCat.logFail(errorMsg);
            }
        } catch (Exception e) {
            LogManager.getLogger(CatLogHelper.class).warn("writeCatLog异常", isSuccess, e, null);
        }
    }
}
