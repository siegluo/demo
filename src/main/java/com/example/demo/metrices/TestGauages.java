package com.example.demo.metrices;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TestGauages {
    private static final MetricRegistry metrics = new MetricRegistry();
    private static final Queue<String> queue = new LinkedBlockingQueue<>();
    private static ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics).build();

    // 测试Gauges，实时统计pending状态的job个数
    public static void main(String[] args) throws InterruptedException {
        reporter.start(3, TimeUnit.SECONDS);
        Gauge<Integer> gauge = new Gauge<Integer>() {
            @Override
            public Integer getValue() {
                return queue.size();
            }
        };
        metrics.register(MetricRegistry.name(TestGauages.class, "pending-job", "size"),gauge);
        JmxReporter jmxReporter = JmxReporter.forRegistry(metrics).build();
        jmxReporter.start();
        for (int i = 0; i < 20; i++) {
            queue.add("a");
            Thread.sleep(1000);
        }
    }

}
