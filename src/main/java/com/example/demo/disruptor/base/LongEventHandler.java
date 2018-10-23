package com.example.demo.disruptor.base;

import com.lmax.disruptor.EventHandler;
import org.jgroups.util.ConcurrentLinkedBlockingQueue;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

//我们还需要一个事件消费者，也就是一个事件处理器。这个事件处理器简单地把事件中存储的数据打印到终端：
public class LongEventHandler implements EventHandler<LongEvent> {

    private ConcurrentLinkedQueue<String> concurrentHashMap;

    public LongEventHandler(ConcurrentLinkedQueue<String> concurrentHashMap) {
        this.concurrentHashMap = concurrentHashMap;
    }

    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        concurrentHashMap.add(String.valueOf(longEvent.getValue()));
    }

}
