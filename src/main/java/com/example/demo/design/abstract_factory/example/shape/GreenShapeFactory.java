package com.example.demo.design.abstract_factory.example.shape;

/**
 * <h3>概要:</h3><p>GreenShapeFactory</p>
 * <h3>功能:</h3><p>具体工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public class GreenShapeFactory extends AbstractShapeFactory{
	@Override
	public Circle createCircle() {
		return new GreenCircle();
	}

	@Override
	public Rectangle createRectangle() {
		return new GreenRectangle();
	}

	@Override
	public Square createSquare() {
		return new GreenSquare();
	}	
}
