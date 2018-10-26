package com.example.demo.spi.common.utils;

import java.util.Calendar;

/**
 * Created by xu_yanga on 2017/10/15.
 */
public class CalendarDateUtils {
    /**
     * 保证时间大于datetime2允许最小值
     *
     * @param sourceCalender
     * @return
     */
    public static Calendar ensureAfterMinCalendar(Calendar sourceCalender) {
        Calendar minCalendar = Calendar.getInstance();
        minCalendar.set(1900, 0, 1, 0, 0, 0);
        if (sourceCalender == null || sourceCalender.before(minCalendar)) {
            return minCalendar;
        } else {
            return sourceCalender;
        }
    }

    /**
     * 保证时间小于datetime2允许最大值
     *
     * @param sourceCalender
     * @return
     */
    public static Calendar ensureBeforeMaxCalendar(Calendar sourceCalender) {
        Calendar maxCalendar = Calendar.getInstance();
        maxCalendar.set(9999, 11, 1, 0, 0, 0);
        if (sourceCalender == null || sourceCalender.after(maxCalendar)) {
            return maxCalendar;
        } else {
            return sourceCalender;
        }

    }
}
