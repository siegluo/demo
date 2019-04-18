package disruptor.base;

import com.lmax.disruptor.EventFactory;
// 需要让disruptor为我们创建事件，我们同时还声明了一个EventFactory来实例化Event对象。
public class LongEventFactory implements EventFactory { 

    @Override 
    public Object newInstance() { 
        return new LongEvent(); 
    } 
} 