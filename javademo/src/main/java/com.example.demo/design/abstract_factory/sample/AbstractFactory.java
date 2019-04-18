package com.example.demo.design.abstract_factory.sample;

/**
 * <h3>概要:</h3><p>AbstractFactory</p>
 * <h3>功能:</h3><p>抽象工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public abstract class AbstractFactory {
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
}
