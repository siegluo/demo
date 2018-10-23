package com.example.demo.design.template_method.sample.template;

/**
 * <h3>概要:</h3><p>ConcreteClass</p>
 * <h3>功能:</h3><p>实现子类</p>
 * <h3>履历:</h3>
 * <li>2016年3月12日  v0.1 版本内容: 新建</li>
 */
public class ConcreteClass extends AbstractClass{

	@Override
	public void method2() {
		System.out.println("ConcreteClass method2 invoke!");
	}
}
