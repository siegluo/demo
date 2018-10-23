package com.example.demo.design.factory_method.example.shape;

/**
 * <h3>概要:</h3><p>Circle</p>
 * <h3>功能:</h3><p>圆形</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("圆形");
	}
}