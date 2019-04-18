package com.example.demo.design.factory_method.example.shape;

/**
 * <h3>概要:</h3><p>CircleFactory</p>
 * <h3>功能:</h3><p>圆形工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public class CircleFactory extends ShapeFactory{
	@Override
	public Shape createShape() {
		return new Circle();
	}
}
