package com.example.demo.design.observer.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();

		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();
		subject.addObserver(observer1);
		subject.addObserver(observer2);

		subject.notifyObserver();
	}
}