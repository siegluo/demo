package com.example.demo.spi.common.async;

import com.ctrip.tour.order.framework.consurrent.DefaultTraceThreadFactory;
import com.ctrip.tour.order.framework.consurrent.TraceThreadPoolExecutor;
import com.ctrip.tour.order.framework.logging.systemlog.util.AsyncExecutor;

import java.util.concurrent.*;

public class AsyncUtils {

    private AsyncUtils() {
    }

    private static ExecutorService executor = new TraceThreadPoolExecutor(30, 200,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<>(1024),
            new DefaultTraceThreadFactory("TrainAction-Domain"),
            new TraceThreadPoolExecutor.TraceAbortPolicy());

    public static <T> Future<T> submit(final Callable<T> task) {
        return AsyncExecutor.submit(executor, task, true);
    }
}
