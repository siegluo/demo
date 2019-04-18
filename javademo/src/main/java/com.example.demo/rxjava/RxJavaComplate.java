package com.example.demo.rxjava;


import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * jmh性能测试
 */
@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Fork(1)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 3, time = 1)
public class RxJavaComplate {

    public static void main(String[] args) throws RunnerException {

        Options build = new OptionsBuilder().include(RxJavaComplate.class.getSimpleName()).build();
        new Runner(build).run();
    }

    /**
     * rxjava的实现方式
     */
    @Benchmark
    public void rxJava() {
        //Rxjava
        Observable.create((ObservableOnSubscribe<String>) e -> {
                    String phone = "1";
                    e.onNext(phone);
                }
        )
                //选择线程模型
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                //订阅 实现onNext
                .subscribe(s -> {
                            String shopBrandAppId = s + "2";
                            try {
                                //模拟业务代码
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            Observable.create((ObservableOnSubscribe<String>) a -> {
                                        String stringUniResp = shopBrandAppId + "3";
                                        a.onNext(stringUniResp);
                                    }
                            )
                                    .subscribeOn(Schedulers.io())
                                    .observeOn(Schedulers.io())
                                    .subscribe(sb -> {
                                                if (StringUtils.hasText(sb)) {
                                                    try {
                                                        Thread.sleep(10);
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            }
                                    );
                        }
                );

    }

    /**
     * 普通的实现方式
     */
    @Benchmark
    public void service() {
        try {
            //模拟业务实现
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
