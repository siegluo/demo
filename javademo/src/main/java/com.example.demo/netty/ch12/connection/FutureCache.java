package com.example.demo.netty.ch12.connection;

import io.netty.channel.ChannelFuture;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

public class FutureCache {
    private static final Map<Integer, Future> map = new ConcurrentHashMap<>();
    public static Future getFuture(Integer port){
        Future channelFuture = map.get(port);
        return channelFuture;
    }
    public static void setFuture(Integer port, Future future){
        map.put(port, future);
    }
}
