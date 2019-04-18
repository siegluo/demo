package com.example.demo.design.decorator.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		component.execute();

		System.out.println("===================");

		Component concreteDecorator = new ConcreteDecorator(component);
		concreteDecorator.execute();
	}
}