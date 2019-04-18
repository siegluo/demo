package com.example.demo.design.abstract_factory.sample;

/**
 * <h3>概要:</h3><p>ConcreteFactory1</p>
 * <h3>功能:</h3><p>具体工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public class ConcreteFactory1 extends AbstractFactory{
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}
}
