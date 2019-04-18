package com.example.demo.design.strategy.sample;

/**
 * <h3>概要:</h3><p>ConcreteStrategy1</p>
 * <h3>功能:</h3><p>具体的策略</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 */
public class ConcreteStrategy1 extends Strategy {
	@Override
	public void execute() {
		System.out.println("StrategyA execute!");
	}
}
