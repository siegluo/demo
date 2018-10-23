package com.example.demo.design.strategy.example.codec;

/**
 * <h3>概要:</h3><p>MD5Strategy</p>
 * <h3>功能:</h3><p>MD5算法</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 */
public class MD5Strategy extends Strategy {

	@Override
	public void encrypt() {
		System.out.println("MD5!");
	}
}
