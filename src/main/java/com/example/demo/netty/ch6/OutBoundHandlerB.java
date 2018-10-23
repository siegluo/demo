package com.example.demo.netty.ch6;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

import java.util.concurrent.TimeUnit;


public class OutBoundHandlerB extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        System.out.println("OutBoundHandlerB: " + msg);
        ctx.write(msg, promise);
    }


    @Override
    public void handlerAdded(final ChannelHandlerContext ctx) {
        ctx.executor().schedule(() -> {
            ctx.channel().write("hello world");
            ctx.write("hello world");
        }, 3, TimeUnit.SECONDS);
    }
}
