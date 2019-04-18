package sync.ThreadPoolExecutor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPoolExecutor {

	
	public static void main(String[] args) {
		
		ThreadPoolExecutor pool = new ThreadPoolExecutor(
				2, 												//核心的线程数量
				100, 											//最大的线程数量
				10, 											//空闲数值 
				TimeUnit.SECONDS, 								//空闲时间单位
				//new ArrayBlockingQueue<Runnable>(3)
				new LinkedBlockingQueue<Runnable>()
				
				//new MyRejected()
				); 			//队列容器
		
		Task t1 = new Task(1, "任务" + 1);
		Task t2 = new Task(2, "任务" + 2);
		Task t3 = new Task(3, "任务" + 3);
		Task t4 = new Task(4, "任务" + 4);
		Task t5 = new Task(5, "任务" + 5);
		//Task t1 = new Task(1, "任务" + 1);
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println(pool.getQueue().size());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(pool.getQueue().size());
		
							
		
		
	}
}
