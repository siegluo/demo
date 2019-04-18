package netty.ch11;

import io.netty.channel.ChannelFuture;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.ArrayList;
import java.util.List;

public class ObserverTest {
    /**
     * 被观察者
     */
    public interface Observerable {
        void registerObserver(Observer o);

        void removeObserver(Observer o);

        void notifyObserver();
    }

    /**
     * 观察者
     */
    public interface Observer {
        void notify(String message);
    }

    public static class Girl implements Observerable {
        private String message;

        List<Observer> observerList;

        public Girl() {
            observerList = new ArrayList<>();
        }


        @Override
        public void registerObserver(Observer o) {
            observerList.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            observerList.remove(o);
        }

        @Override
        public void notifyObserver() {
            for (Observer observer : observerList) {
                observer.notify(message);
            }
        }

        public void hasBoyFriend() {
            message = "女神有男朋友了";
            notifyObserver();
        }

        public void getMarried() {
            message = "女神结婚了，你们都死心吧!";
            notifyObserver();
        }

        public void getSingled() {
            message = "女神单身了，你们有机会了!";
            notifyObserver();
        }
    }

    /**
     * 男孩
     */
    public static class Boy implements Observer {
        @Override
        public void notify(String message) {
            System.out.println("男孩收到消息：" + message);
        }
    }

    /**
     * 男人
     */
    public static class Man implements Observer {
        @Override
        public void notify(String message) {
            System.out.println("男人收到消息：" + message);
        }
    }

    /**
     * 老男人
     */
    public static class OldMan implements Observer {
        @Override
        public void notify(String message) {
            System.out.println("老男人收到消息：" + message);
        }
    }

    public static void main(String[] args) {
        Girl girl = new Girl();
        Boy boy = new Boy();
        Man man = new Man();
        OldMan oldMan = new OldMan();

        // 通知男孩、男人、老男人，女神有男朋友了
        girl.registerObserver(boy);
        girl.registerObserver(man);
        girl.registerObserver(oldMan);
        girl.hasBoyFriend();
        System.out.println("====================");

        // 通知男孩，男人，女神结婚了
        girl.removeObserver(oldMan);
        girl.getMarried();
        System.out.println("====================");


        girl.registerObserver(oldMan);
        girl.getSingled();
    }


    public void write(NioSocketChannel channel, Object object) {
        ChannelFuture channelFuture = channel.writeAndFlush(object);
        channelFuture.addListener(future -> {
            if (future.isSuccess()) {

            } else {

            }
        });
        channelFuture.addListener(future -> {
            if (future.isSuccess()) {

            } else {

            }
        });
        channelFuture.addListener(future -> {
            if (future.isSuccess()) {

            } else {

            }
        });
    }

}
