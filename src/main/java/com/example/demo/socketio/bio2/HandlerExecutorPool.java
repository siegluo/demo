package com.example.demo.socketio.bio2;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author jie.luo
 */
public class HandlerExecutorPool {

	private ExecutorService executor;
	public HandlerExecutorPool(int maxPoolSize, int queueSize){
		ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("secketdemo").build();
		this.executor = new ThreadPoolExecutor(
				Runtime.getRuntime().availableProcessors(),
				maxPoolSize, 
				120L, 
				TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(queueSize),
				threadFactory,
				new ThreadPoolExecutor.DiscardOldestPolicy());
	}
	
	public void execute(Runnable task){
		this.executor.execute(task);
	}
	
	
	
}
