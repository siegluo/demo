package com.example.demo.spi.common.utils;

/**
 * Created by xu_yanga on 2017/10/16.
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    //截取中文字符
    public static String getSubString(String str, int length) {
        int count = 0;
        int offset = 0;
        char[] c = str.toCharArray();
        int size = c.length;
        if (size >= length) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] > 256) {
                    offset = 2;
                    count += 2;
                } else {
                    offset = 1;
                    count++;
                }
                if (count == length) {
                    return str.substring(0, i + 1);
                }
                if ((count == length + 1 && offset == 2)) {
                    return str.substring(0, i);
                }
            }
        } else {
            return str;
        }
        return "";
    }


}
