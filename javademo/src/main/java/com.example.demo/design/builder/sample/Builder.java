package com.example.demo.design.builder.sample;

/**
 * <h3>概要:</h3><p>Builder</p>
 * <h3>功能:</h3><p>抽象建造者</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public abstract class Builder {
	
	// 创建产品对象
	protected Product product = new Product();

	public abstract void buildPartA();

	public abstract void buildPartB();

	// 返回产品对象
	public Product getResult() {
		return this.product;
	}
}