package com.example.demo.design.strategy.example.codec;

/**
 * <h3>概要:</h3><p>DESStrategy</p>
 * <h3>功能:</h3><p>DES算法</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class DESStrategy extends Strategy {

	@Override
	public void encrypt() {
		System.out.println("DES!");
	}
}
