package com.example.demo.design.simple_factory.example.chart;

/**
 * <h3>概要:</h3><p>ChartFactory</p>
 * <h3>功能:</h3><p>图表工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public class ChartFactory {

	public Chart getChart(String chartType) {
		if ("PIE".equalsIgnoreCase(chartType)) {
			return new Pie();
		} else if ("LINE".equalsIgnoreCase(chartType)) {
			return new Line();
		} 
		return null;
	}
}