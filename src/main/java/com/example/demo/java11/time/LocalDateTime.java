package com.example.demo.java11.time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;

public class LocalDateTime {

    public static void main(String[] args) {

        //使用默认时区时钟瞬时时间创建 Clock.systemDefaultZone() -->即相对于 ZoneId.systemDefault()默认时区
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println(now);

//自定义时区
        java.time.LocalDateTime now2 = java.time.LocalDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(now2);//会以相应的时区显示日期

//自定义时钟
        Clock clock = Clock.system(ZoneId.of("Asia/Dhaka"));
        java.time.LocalDateTime now3 = java.time.LocalDateTime.now(clock);
        System.out.println(now3);//会以相应的时区显示日期

//不需要写什么相对时间 如java.util.Date 年是相对于1900 月是从0开始
//2013-12-31 23:59
        java.time.LocalDateTime d1 = java.time.LocalDateTime.of(2013, 12, 31, 23, 59);

//年月日 时分秒 纳秒
        java.time.LocalDateTime d2 = java.time.LocalDateTime.of(2013, 12, 31, 23, 59, 59, 11);

        long l = java.time.LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Instant instant1 = Instant.ofEpochMilli(l);

//使用瞬时时间 + 时区
        Instant instant = Instant.now();
        java.time.LocalDateTime d3 = java.time.LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(d3);

//解析String--->LocalDateTime
        java.time.LocalDateTime d4 = java.time.LocalDateTime.parse("2013-12-31T23:59");
        System.out.println(d4);

        java.time.LocalDateTime d5 = java.time.LocalDateTime.parse("2013-12-31T23:59:59.999");//999毫秒 等价于999000000纳秒
        System.out.println(d5);

//使用DateTimeFormatter API 解析 和 格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        java.time.LocalDateTime d6 = java.time.LocalDateTime.parse("2013/12/31 23:59:59", formatter);
        System.out.println(formatter.format(d6));


//时间获取
        System.out.println(d6.getYear());
        System.out.println(d6.getMonth());
        System.out.println(d6.getDayOfYear());
        System.out.println(d6.getDayOfMonth());
        System.out.println(d6.getDayOfWeek());
        System.out.println(d6.getHour());
        System.out.println(d6.getMinute());
        System.out.println(d6.getSecond());
        System.out.println(d6.getNano());
//时间增减
        java.time.LocalDateTime d7 = d6.minusDays(1);
        java.time.LocalDateTime d8 = d7.plus(1, IsoFields.QUARTER_YEARS);

//LocalDate 即年月日 无时分秒
//LocalTime即时分秒 无年月日
//API和LocalDateTime类似就不演示了

    }
}
