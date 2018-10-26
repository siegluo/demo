package com.example.demo.spi.common.clog;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public class LogManager {
    public static ILog getLogger(Class<?> type) {
        com.ctrip.framework.clogging.agent.log.ILog iLog = com.ctrip.framework.clogging.agent.log.LogManager.getLogger(type);
        return new Log(iLog);
    }
}
