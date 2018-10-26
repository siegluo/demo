package com.example.demo.spi.common.utils;

import com.ctrip.tour.order.train.actionservice.common.clog.ILog;
import com.ctrip.tour.order.train.actionservice.common.clog.LogManager;

import java.text.SimpleDateFormat;

/**
 * Created by xu_yanga on 2018/2/24.
 */
public class DateRangeUtils {
    private static ILog logger = LogManager.getLogger(DateRangeUtils.class);


    public static Boolean isIntTime(String sourceTime, String curTime) throws Exception {
        if (sourceTime == null || !sourceTime.contains("-") || !sourceTime.contains(":")) {
            throw new Exception(String.format("QConfig配置的扣位时间区间:%s不合法；", sourceTime));
        }
        String[] args = sourceTime.split("-");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long now = sdf.parse(curTime).getTime();
        long start = sdf.parse(args[0]).getTime();
        long end = sdf.parse(args[1]).getTime();
        if (args[1].equals("00:00")) {
            args[1] = "24:00";
        }
        if (end < start) {
            if (now > end && now < start) {
                return false;
            } else {
                return true;
            }
        } else {
            if (now > start && now < end) {
                return true;
            } else {
                return false;
            }
        }
    }
}
