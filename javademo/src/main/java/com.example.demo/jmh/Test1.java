package com.example.demo.jmh;

import socketio.nio.nio.NioSocketClient;
import org.joda.time.DateTime;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Fork(1)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 3, time = 1)
public class Test1 {

    @Benchmark
    public Calendar runCalendar() {
        return Calendar.getInstance();
    }

    @Benchmark
    public DateTime runDateTime() {
        return new DateTime();
    }

    @Benchmark
    public Long measureName() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) throws RunnerException {

        Options build = new OptionsBuilder().include(Test1.class.getSimpleName()).build();
        new Runner(build).run();
    }

}
