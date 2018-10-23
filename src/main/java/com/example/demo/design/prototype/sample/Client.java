package com.example.demo.design.prototype.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户类</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public class Client {
	public static void main(String[] args) {
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAttr("梁桂钊");
		
		ConcretePrototype prototype2 = prototype.clone();
		
		System.out.println(prototype.toString());
		System.out.println(prototype2.toString());
	}
}
