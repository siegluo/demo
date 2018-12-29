package com.example.demo.netty.ch12.connection;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.concurrent.Future;

import static com.example.demo.netty.ch12.connection.Constant.BEGIN_PORT;
import static com.example.demo.netty.ch12.connection.Constant.N_PORT;

public class Client {

    private static final String SERVER_HOST = "127.0.0.1";

    public static void main(String[] args) {
        new Client().start(BEGIN_PORT, N_PORT);
        int index = 0;
        int port;
        for (int a = BEGIN_PORT;a<= N_PORT;a++){
            port = a;
            try {
                ChannelFuture channelFuture = ConnectPool.getChannelFuture(port);
                channelFuture.channel().writeAndFlush(port);
                Object o = FutureCache.getFuture(port).get();
                System.out.print(o.toString());
            } catch (Exception e) {
            }

        }
    }

    public void start(final int beginPort, int nPort) {
        System.out.println("client starting....");
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        final Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(eventLoopGroup);
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_REUSEADDR, true);
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) {
                ch.pipeline().addLast(ClientBusinessHandler.INSTANCE);
            }
        });


        int index = 0;
        int port;
        for (int a = beginPort;a<= nPort;a++){
            port = a;
            try {
                ChannelFuture channelFuture = bootstrap.connect(SERVER_HOST, port);
                channelFuture.addListener((ChannelFutureListener) future -> {
                    if (!future.isSuccess()) {
                        System.out.println("connect failed, exit!");
                        System.exit(0);
                    }
                });
                ConnectPool.setChannelFuture(port, channelFuture);
            } catch (Exception e) {
            }


        }
    }
}
