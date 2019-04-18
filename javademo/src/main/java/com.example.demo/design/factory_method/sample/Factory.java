package com.example.demo.design.factory_method.sample;

/**
 * <h3>概要:</h3><p>Factory</p>
 * <h3>功能:</h3><p>抽象工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public abstract class Factory {
	public final Product create(){
		Product product = createProduct();
		return product;
	}
	
	public abstract Product createProduct();
}
