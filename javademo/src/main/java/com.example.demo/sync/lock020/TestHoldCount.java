package com.example.demo.sync.lock020;

import java.util.concurrent.locks.ReentrantLock;
/**
 * lock.getHoldCount()方法：只能在当前调用线程内部使用，不能再其他线程中使用
 * 那么我可以在m1方法里去调用m2方法，同时m1方法和m2方法都持有lock锁定即可 测试结果holdCount数递增
 *
 */
public class TestHoldCount {

	//重入锁
	private ReentrantLock lock = new ReentrantLock();
	
	public void m1(){
		try {
			lock.lock();
			System.out.println("进入m1方法，holdCount数为：" + lock.getHoldCount());
			
			//调用m2方法
			m2();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void m2(){
		try {
			lock.lock();
			System.out.println("进入m2方法，holdCount数为：" + lock.getHoldCount());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	
	public static void main(String[] args) {
		TestHoldCount thc = new TestHoldCount();
		thc.m1();
	}
}
