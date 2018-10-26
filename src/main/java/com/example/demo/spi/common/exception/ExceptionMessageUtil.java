package com.example.demo.spi.common.exception;

import com.ctrip.tour.order.train.actionservice.common.clog.ILog;
import com.ctrip.tour.order.train.actionservice.common.clog.LogManager;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;

/**
 * @author xu_yanga
 * @description 异常原因
 * @date 2018/8/30 12:32
 */
public class ExceptionMessageUtil {

    private static ILog logger = LogManager.getLogger(ExceptionMessageUtil.class);

    public static String writeExceptionAllinformation(String title, Exception ex, Map<String, String> clogTags) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream pout = new PrintStream(out);
        ex.printStackTrace(pout);
        String ret = new String(out.toByteArray());
        pout.close();
        try {
            out.close();
        } catch (Exception e) {
        }
        logger.error(title, ret, clogTags);
        return ret;
    }

    public static String writeExceptionAllinformationByWriteWarningLog(String title, Exception ex, Map<String, String> clogTags) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream pout = new PrintStream(out);
        ex.printStackTrace(pout);
        String ret = new String(out.toByteArray());
        pout.close();
        try {
            out.close();
        } catch (Exception e) {
        }
        logger.warn(title, ret, "", clogTags);
        return ret;
    }
}
