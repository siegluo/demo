package com.example.demo.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import org.springframework.util.StringUtils;

public class RxJavaTest01 {

    public static void main(String[] args) throws Exception {
        Observable.create((ObservableOnSubscribe<String>) e -> {
                    String phone = "1";
                    e.onNext(phone);
                }
        )
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(s -> {
                            String shopBrandAppId = s + "2";
                            System.out.println(shopBrandAppId);
                            Observable.create((ObservableOnSubscribe<String>) a -> {
                                        String stringUniResp = shopBrandAppId + "3";
                                        a.onNext(stringUniResp);
                                    }
                            )
                                    .subscribeOn(Schedulers.io())
                                    .observeOn(Schedulers.io())
                                    .subscribe(sb -> {
                                                if (StringUtils.hasText(sb)) {
                                                    System.out.println(sb);
                                                }
                                            }
                                    );
                        }
                );
        System.in.read();
    }

}
