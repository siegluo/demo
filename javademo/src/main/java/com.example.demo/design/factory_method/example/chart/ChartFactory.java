package com.example.demo.design.factory_method.example.chart;

/**
 * <h3>概要:</h3><p>ChartFactory</p>
 * <h3>功能:</h3><p>抽象工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public abstract class ChartFactory {

	public final Chart create(){
		Chart chart = createChart();
		return chart;
	}
	
	public abstract Chart createChart();
}
