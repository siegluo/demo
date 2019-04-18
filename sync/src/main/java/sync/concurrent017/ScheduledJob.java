package sync.concurrent017;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledJob {

    public static void main(String[] args) throws Exception {

        Temp command = new Temp();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> scheduleTask = scheduler.scheduleWithFixedDelay(command, 15, 1, TimeUnit.SECONDS);
    }


}

class Temp extends Thread {
    @Override
    public void run() {
        System.out.println("run");
    }
}