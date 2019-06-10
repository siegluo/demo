package netty.ch3;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

public final class Client {

    public static void main(String[] args) throws Exception {
        EventLoopGroup clientGroup = new NioEventLoopGroup();
        Bootstrap group = new Bootstrap().group(clientGroup);
        ChannelFuture connect = group.connect("127.0.0.1", 8888);
    }

}
