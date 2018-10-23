package com.example.demo.design.observer.sample;

import java.util.ArrayList;

/**
 * <h3>概要:</h3><p>Subject</p>
 * <h3>功能:</h3><p>目标类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public abstract class Subject {

	protected ArrayList<Observer> observers = new ArrayList<Observer>();

	/**
	 * 添加观察者对象
	 * @param observer
     */
	public void addObserver(Observer observer) {
		if (observer == null){
			throw new NullPointerException();
		}

		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	/**
	 * 删除观察者对象
	 * @param observer
     */
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 通知方法
	 */
	public abstract void notifyObserver();
}
