package com.example.demo.design.factory_method.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		Product product = factory.create();
		product.method();
	}
}
