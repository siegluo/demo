package com.example.demo.design.simple_factory.example.shape;

/**
 * <h3>概要:</h3><p>SimpleShapeFactory</p>
 * <h3>功能:</h3><p>图形工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class SimpleShapeFactory {
	public Shape createShape(String shapeType) {
		if ("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
}