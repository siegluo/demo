package com.example.demo.spi.common.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by xu_yanga on 2017/12/3.
 */
public class CommonDateUtils {
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String MMDDHHMMSSSSS = "MMddHHmmssSSS";
    public static final String SSSSS = "SSS";
    public static final String YYYY_SLASH_MM_SLASH_DD_HH_MM = "yyyy/MM/dd HH:mm";
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String HH_MM = "HH:mm";
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYY = "yyyy";
    public static final String MM = "MM";
    public static final String DD = "dd";


    public static Date date2date(Date date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        String str = sdf.format(date);
        try {
            date = sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
        return date;
    }


    public static String date2string(Date date, String formatStr) {
        String strDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        strDate = sdf.format(date);
        return strDate;
    }

    public static String timestamp2string(Timestamp timestamp, String formatStr) {
        String strDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        strDate = sdf.format(timestamp);
        return strDate;
    }

    public static Calendar timestamp2Calendar(Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        return calendar;
    }

    public static Date string2date(String dateString, String formatStr) {
        Date formateDate = null;
        DateFormat format = new SimpleDateFormat(formatStr);
        try {
            formateDate = format.parse(dateString);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
        return formateDate;
    }

    public static Timestamp date2timestamp(Date date) {
        if (date == null)
            return null;
        return new Timestamp(date.getTime());
    }

    public static String getNowYear() {
        SimpleDateFormat sdf = new SimpleDateFormat(YYYY);
        return sdf.format(new Date());
    }

    public static String getNowMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat(MM);
        return sdf.format(new Date());
    }

    public static String getNowDay() {
        SimpleDateFormat sdf = new SimpleDateFormat(DD);
        return sdf.format(new Date());
    }
}
