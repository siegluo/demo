package com.example.demo.design.adapter.sample;

/**
 * <h3>概要:</h3><p>Adapter</p>
 * <h3>功能:</h3><p>类适配器</p>
 * <h3>履历:</h3>
 * <li>2017年1月23日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Adapter extends Target{
	
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request(){
		adaptee.specRequest();
	}
}
