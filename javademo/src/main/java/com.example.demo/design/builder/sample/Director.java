package com.example.demo.design.builder.sample;

/** 
 * <h3>概要:</h3><p>Director</p>
 * <h3>功能:</h3><p>指挥者</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	// 产品构建与组装方法
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		return builder.getResult();
	}
}