package netty.ch12.connection;

import io.netty.channel.ChannelFuture;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConnectPool {
    private static final Map<Integer, ChannelFuture> map = new ConcurrentHashMap<>();

    public static ChannelFuture getChannelFuture(Integer port){
        ChannelFuture channelFuture = map.get(port);
        return channelFuture;
    }
    public static void setChannelFuture(Integer port, ChannelFuture channelFuture){
         map.put(port, channelFuture);
    }
}
