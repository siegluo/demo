package com.example.demo.design.strategy.example.horse;

/**
 * <h3>概要:</h3><p>MediumHorse</p>
 * <h3>功能:</h3><p>中等马的策略</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 */
public class MediumHorse extends Strategy {
	@Override
	public void run() {
		System.out.println("中等马 跑!!!");
	}
}
