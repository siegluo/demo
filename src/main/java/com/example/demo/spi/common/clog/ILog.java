package com.example.demo.spi.common.clog;

import java.util.Map;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public interface ILog {

    void info(String title, Object message, Map<String, String> map);

    void info(String title, Object request, Object response, Map<String, String> map);

    void warn(String title, Object request, Object response, Map<String, String> map);

    void error(String title, Object message, Map<String, String> map);

    void error(String title, Object request, Object response, Map<String, String> map);

    void error(String title, Throwable ex, Map<String, String> map);

    void error(String title, Object request, Exception ex, Map<String, String> map);

}
