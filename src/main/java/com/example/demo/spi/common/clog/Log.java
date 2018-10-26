package com.example.demo.spi.common.clog;


import com.ctrip.hermes.core.utils.StringUtils;
import com.ctrip.tour.order.framework.consurrent.DefaultTraceThreadFactory;
import com.ctrip.tour.order.framework.consurrent.TraceThreadPoolExecutor;
import com.ctrip.tour.order.train.actionservice.common.serializer.JsonUtils;
import com.ctrip.tour.order.train.actionservice.dal.pkgbizlogdb.dao.OCallServiceLogDal;
import com.ctrip.tour.order.train.actionservice.dal.pkgbizlogdb.entity.OCallServiceLog;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public class Log implements ILog {
    private com.ctrip.framework.clogging.agent.log.ILog logger;

    public Log(com.ctrip.framework.clogging.agent.log.ILog logger) {
        this.logger = logger;
    }

    private static ExecutorService executorService = new TraceThreadPoolExecutor(30, 200,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<>(1024),
            new DefaultTraceThreadFactory("TrainJob-Domain"),
            new TraceThreadPoolExecutor.TraceAbortPolicy());

    @Override
    public void info(String title, Object message, Map<String, String> map) {
        info(title, message, null, map);
    }


    

    @Override
    public void info(final String title, final Object request, final Object response, final Map<String, String> map) {
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String requestJson = "";
                    String responseJson = "";
                    if (request != null) {
                        requestJson = JsonUtils.toJson(request);
                    }
                    if (response != null) {
                        responseJson = JsonUtils.toJson(response);
                    }
                    StringBuilder stringBuilder = new StringBuilder("");
                    stringBuilder.append(requestJson).append("\t\n");
                    stringBuilder.append(responseJson);
                    logger.info(title, stringBuilder.toString(), map);
                    writeOCallServiceLog(title, requestJson, responseJson, map);
                }
            });
        } catch (Throwable e) {
            logger.warn("异常", e);
        }
    }

    @Override
    public void warn(final String title, final Object request, final Object response, final Map<String, String> map) {
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String requestJson = "";
                    String responseJson = "";
                    if (request != null) {
                        requestJson = JsonUtils.toJson(request);
                    }
                    if (response != null) {
                        responseJson = JsonUtils.toJson(response);
                    }
                    StringBuilder stringBuilder = new StringBuilder("");
                    stringBuilder.append(requestJson).append("\t\n");
                    stringBuilder.append(responseJson);
                    logger.warn(title, stringBuilder.toString(), map);
                    writeOCallServiceLog(title, requestJson, responseJson, map);
                }
            });
        } catch (Throwable e) {
            logger.warn("异常", e);
        }
    }

    @Override
    public void error(String title, Object message, Map<String, String> map) {
        error(title, message, null, map);
    }

    @Override
    public void error(final String title, final Object request, final Object response, final Map<String, String> map) {
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String requestJson = "";
                    String responseJson = "";
                    if (request != null) {
                        requestJson = JsonUtils.toJson(request);
                    }
                    if (response != null) {
                        responseJson = JsonUtils.toJson(response);
                    }
                    StringBuilder stringBuilder = new StringBuilder("");
                    stringBuilder.append(requestJson).append("\t\n");
                    stringBuilder.append(responseJson);
                    logger.error(title, stringBuilder.toString(), map);
                    writeOCallServiceLog(title, requestJson, responseJson, map);
                }
            });
        } catch (Throwable e) {
            logger.warn("异常", e);
        }
    }

    @Override
    public void error(final String title, final Throwable ex, final Map<String, String> map) {
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String requestJson = "";
                    logger.error(title, ex, map);
                    writeOCallServiceLog(title, requestJson, ex.toString(), map);
                }
            });
        } catch (Throwable e) {
            logger.warn("异常", e);
        }
    }

    @Override
    public void error(final String title, final Object request, final Exception ex, final Map<String, String> map) {
        try {
            info(title, request, map);
            error(title, ex, map);
        } catch (Throwable e) {
            logger.warn("异常", e);
        }
    }

    private void writeOCallServiceLog(String title, String request, String response, Map<String, String> map) {
        OCallServiceLog oCallServiceLog = new OCallServiceLog();
        oCallServiceLog.setDataChange_CreateTime(new Timestamp(System.currentTimeMillis()));
        oCallServiceLog.setDataChange_LastTime(new Timestamp(System.currentTimeMillis()));
        oCallServiceLog.setRequestFrom("trainaction");
        oCallServiceLog.setRequestXml(request);
        oCallServiceLog.setResponseXml(response);
        oCallServiceLog.setTempOrderID(0L);
        oCallServiceLog.setResultMessage("");
        if (StringUtils.isBlank(title)) {
            oCallServiceLog.setRequestTitle("train");
        } else {
            if (title.length() > 45) {
                oCallServiceLog.setRequestTitle(title.substring(title.length() - 45));
            } else {
                oCallServiceLog.setRequestTitle(title);
            }
        }
        if (map != null) {
            for (String key : map.keySet()) {
                if ("orderid".equalsIgnoreCase(key)) {
                    oCallServiceLog.setOrderID(Long.valueOf(map.get(key)));
                }
                if ("tmporderid".equalsIgnoreCase(key)) {
                    oCallServiceLog.setTempOrderID(Long.valueOf(map.get(key)));
                }
            }
        }
        new OCallServiceLogDal().insert(oCallServiceLog);
    }
}
