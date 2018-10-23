package com.example.demo.design.abstract_factory.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory concreteFactory1 = new ConcreteFactory1();
		AbstractProductA productA1 = concreteFactory1.createProductA();
		AbstractProductB productB1 = concreteFactory1.createProductB();
		
		AbstractFactory concreteFactory2 = new ConcreteFactory2();
		AbstractProductA productA2 = concreteFactory2.createProductA();
		AbstractProductB productB2 = concreteFactory2.createProductB();
	}
}
