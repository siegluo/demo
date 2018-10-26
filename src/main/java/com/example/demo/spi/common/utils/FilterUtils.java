package com.example.demo.spi.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xu_yanga on 2018/1/3.
 */
public class FilterUtils {
    /**
     * @param number
     * @return
     * @Title : filterNumber
     * @Type : FilterStr
     * @date : 2014年3月12日 下午7:23:03
     * @Description : 过滤出数字
     */
    public static String filterNumber(String number) {
        number = number.replaceAll("[^(0-9)]", "");
        return number;
    }

    /**
     * @param alph
     * @return
     * @Title : filterAlphabet
     * @Type : FilterStr
     * @date : 2014年3月12日 下午7:28:54
     * @Description : 过滤出字母
     */
    public static String filterAlphabet(String alph) {
        alph = alph.replaceAll("[^(A-Za-z)]", "");
        return alph;
    }

    /**
     * @param chin
     * @return
     * @Title : filterChinese
     * @Type : FilterStr
     * @date : 2014年3月12日 下午9:12:37
     * @Description : 过滤出中文
     */
    public static String filterChinese(String chin) {
        chin = chin.replaceAll("[^(\\u4e00-\\u9fa5)]", "");
        return chin;
    }


    /**
     * @param character
     * @return
     * @Title : filterChineseAndAlphabetAndNumber
     * @Type : FilterStr
     * @date : 2014年3月12日 下午9:17:22
     * @Description : 过滤出字母、中文
     */
    public static String filterChineseAndAlphabet(String character) {
        character = character.replaceAll("[^(a-zA-Z\\u4e00-\\u9fa5)]", "");
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(character);
        return m.replaceAll("").trim();
    }
}
