package com.example.demo.spi.common.utils;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Sun Xingbin on 2017/10/19.
 */

@Component
public class TimeUtils {

    public Calendar convert(Timestamp timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        return calendar;
    }

    public String getTimeString() {
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }
}
