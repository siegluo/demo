package com.example.demo.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

public class RxJavaTest00 {

    public static Logger logger = Logger.getLogger("RxJavaTest00");

    public static void main(String[] args) throws Exception {

        List<String> aList = new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(6);
        // 第一步：初始化Observable
        for (int i = 0; i < 28; i++) {
            int a = i;
            Observable.create((ObservableOnSubscribe<Integer>) e -> {
//                e.onNext(1);
//                e.onNext(2);
//                e.onNext(3);
//                e.onComplete();
//                e.onNext(4);
                e.onNext(a);
                e.onComplete();

            }).subscribeOn(Schedulers.io()).observeOn(Schedulers.io())
                    .subscribe(new Observer<Integer>() { // 第三步：订阅

                        // 第二步：初始化Observer
                        private int i = 0;
                        private Disposable mDisposable;

                        @Override
                        public void onSubscribe(@NonNull Disposable d) {
                            mDisposable = d;
                        }

                        @Override
                        public void onNext(@NonNull Integer integer) {
                            i++;
//                if (i == 2) {
//                    // 在RxJava 2.x 中，新增的Disposable可以做到切断的操作，让Observer观察者不再接收上游事件
//                    mDisposable.dispose();
//                }
//                if (i == 5) {
//                    mDisposable.dispose();
//                }
                            try {
                                if (integer == 2) {
                                    throw new RuntimeException("i==2");
                                }
                            } catch (Exception e) {
                                aList.add("error");
                            }
                            aList.add(integer.toString());
                            try {
                                Thread.sleep(1000 * integer);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            logger.info(integer.toString());

                        }

                        @Override
                        public void onError(@NonNull Throwable e) {
//                            logger.info("error");
//                            latch.countDown();
//                            aList.add("error");
//                            e.printStackTrace();
                        }

                        @Override
                        public void onComplete() {
//                            System.out.println(aList);
                            logger.info("complete");
                            latch.countDown();
                        }
                    });
        }
        latch.await();
        System.out.println(aList);

    }
}
