package com.example.demo.design.abstract_factory.example.simple_reflection;

/** 
 * <h3>概要:</h3><p>BlueCircle</p>
 * <h3>功能:</h3><p>蓝色的圆形</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public class BlueCircle extends Circle {
	@Override
	public void draw() {
		System.out.println("蓝色的圆形");
	}
}