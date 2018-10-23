package com.example.demo.sync.sync006;

/**
 * 使用synchronized代码块减小锁的粒度，提高性能
 *
 */
public class Optimize {

	public void doLongTimeTask(){
		try {
			
			System.out.println("当前线程开始：" + Thread.currentThread().getName() + 
					", 正在执行一个较长时间的业务操作，其内容不需要同步");
			Thread.sleep(2000);
			
			synchronized(this){
				System.out.println("当前线程：" + Thread.currentThread().getName() + 
					", 执行同步代码块，对其同步变量进行操作");
				Thread.sleep(1000);
			}
			System.out.println("当前线程结束：" + Thread.currentThread().getName() +
					", 执行完毕");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		final Optimize otz = new Optimize();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				otz.doLongTimeTask();
			}
		},"t1");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				otz.doLongTimeTask();
			}
		},"t2");
		t1.start();
		t2.start();
		
	}
	
	
}
