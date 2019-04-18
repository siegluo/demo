package com.example.demo.netty.ch11;

import io.netty.handler.timeout.ReadTimeoutException;

/**
 * @see ReadTimeoutException
 */


public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
