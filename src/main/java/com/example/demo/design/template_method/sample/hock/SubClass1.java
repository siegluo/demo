package com.example.demo.design.template_method.sample.hock;

/**
 * <h3>概要:</h3><p>SubClass1</p>
 * <h3>功能:</h3><p>实现子类</p>
 * <h3>履历:</h3>
 * <li>2016年3月12日  v0.1 版本内容: 新建</li>
 */
public class SubClass1 extends AbstractClass{

	@Override
	public void method2() {
		System.out.println("ConcreteClass method2 invoke!");
	}

}
