package com.example.demo.design.singleton.example.counter;

/**
 * <h3>概要:</h3><p>Counter</p>
 * <h3>功能:</h3><p>单例模式 累加器</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Counter {

	private Counter(){}
	
	private long count = 0;
	private static Counter counter = new Counter();
	
	public static Counter getInstance(){
		return counter;
	}
	
	public synchronized long plus(){
		return ++count;
	}
}
