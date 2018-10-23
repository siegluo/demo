package com.example.demo.design.facade;

/**
 * <h3>概要:</h3><p>Facade</p>
 * <h3>功能:</h3><p>外观类</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Facade {
	public void method(){
		System1 system1 = new System1();
		system1.method1();

		System2 system2 = new System2();
		system2.method2();
	}
}
