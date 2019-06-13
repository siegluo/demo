package com.example.demo.list;

import java.io.UnsupportedEncodingException;

public class StringCharTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("改签失败:出票失败，您好，开车前48小时（不含）以上，可改签预售期内的其它列车；开车前48小时以内且非开车当日，可改签票面日期当日及之前的其它列车；开车当日，可改签票面日期当日的其它列车。");
        }
        String s = sb.toString();
        try {
            System.out.println("s.length: " + s.length() + "  s.getBytes.length  " + s.getBytes().length + "   " + s.getBytes("utf-8").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
