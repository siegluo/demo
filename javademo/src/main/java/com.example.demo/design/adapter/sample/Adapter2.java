package com.example.demo.design.adapter.sample;


/**
 * <h3>概要:</h3><p>Adapter2</p>
 * <h3>功能:</h3><p>对象适配器</p>
 * <h3>履历:</h3>
 * <li>2017年1月23日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Adapter2{
	
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request(){
		adaptee.specRequest();
	}
}
