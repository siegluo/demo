package com.example.demo.design.abstract_factory.example.shape;

/** 
 * <h3>概要:</h3><p>GreenRectangle</p>
 * <h3>功能:</h3><p>绿色的长方形</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public class GreenRectangle extends Rectangle {
	@Override
	public void draw() {
		System.out.println("绿色的长方形");
	}
}