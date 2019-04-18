package com.example.demo.squirrel;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EndPoint {
    @Autowired
    private DiscountRefundStateMachineEngine discountRefundStateMachineEngine;

    @GetMapping("/a")
    public void endPoint1() {
        List<String> aList = new ArrayList<>();
        // 第一步：初始化Observable
        for (int i = 0; i < 100; i++) {
            int a = i;
            Observable.create((ObservableOnSubscribe<Integer>) e -> {
                e.onNext(a);
                e.onComplete();

            }).subscribeOn(Schedulers.io()).observeOn(Schedulers.io())
                    .subscribe(new Observer<Integer>() { // 第三步：订阅

                        private int i = 0;
                        private Disposable mDisposable;

                        @Override
                        public void onSubscribe(@NonNull Disposable d) {
                            mDisposable = d;
                        }

                        @Override
                        public void onNext(@NonNull Integer integer) {
                            if (integer % 5 == 0) {
                                discountRefundStateMachineEngine.fire(integer, Status.CONFIRMING, Trigger.APPLY_APPROVED, new Context(integer));
                            } else if (integer % 5 == 1) {
                                discountRefundStateMachineEngine.fire(integer, Status.CONFIRMING, Trigger.REJECT, new Context(integer));
                            } else if (integer % 5 == 2) {
                                discountRefundStateMachineEngine.fire(integer, Status.REFUND_APPROVING, Trigger.REFUND_APPROVED, new Context(integer));
                            } else if (integer % 5 == 3) {
                                discountRefundStateMachineEngine.fire(integer, Status.REFUND_APPROVED, Trigger.REFUND_FINISH_CONFIRM, new Context(integer));
                            } else if (integer % 5 == 4) {
                                discountRefundStateMachineEngine.fire(integer, Status.PENDING, Trigger.APPLY_CONFIRM, new Context(integer));
                            }
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {
                        }

                        @Override
                        public void onComplete() {
                        }
                    });
        }
    }
}
