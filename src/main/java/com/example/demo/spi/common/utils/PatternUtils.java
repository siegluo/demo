package com.example.demo.spi.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtils {

    private static final Pattern trainNumberPattern = Pattern.compile("([a-zA-Z0-9]{1,},){0,}[a-zA-Z0-9]{1,}");


    public static Boolean matchTrainNumbers(String content) {
        Matcher matcher = trainNumberPattern.matcher(content);
        return matcher.matches();
    }
}
