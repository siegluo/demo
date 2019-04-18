package com.example.demo.metrices;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Counter;
import com.codahale.metrics.MetricRegistry;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TestCounter {
    private static final MetricRegistry metrics = new MetricRegistry();
    private static final Queue<String> queue = new LinkedBlockingQueue<>();
    private static ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics).build();
    private static Counter counter = metrics.counter(MetricRegistry.name(TestCounter.class, "pending-jobs"));

    // 测试Gauges，实时统计pending状态的job个数
    public static void main(String[] args) throws InterruptedException {
        reporter.start(3, TimeUnit.SECONDS);
        while (true) {
            add("1");
            Thread.sleep(1000);
        }
    }

    private static void add(String str){
        counter.inc();
        queue.offer(str);
    }

    private static String take(){
        counter.dec();
        return queue.poll();
    }

}
