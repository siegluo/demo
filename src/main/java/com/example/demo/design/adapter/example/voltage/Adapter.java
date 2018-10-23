package com.example.demo.design.adapter.example.voltage;

/**
 * <h3>概要:</h3><p>Adapter</p>
 * <h3>功能:</h3><p>适配器[继承方式]</p>
 * <h3>履历:</h3>
 * <li>2017年1月24日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Adapter extends Voltage{
	
	private CurVoltage curVoltage = new CurVoltage();
	
	@Override
	public void getVoltage(){
		curVoltage.getVoltage();
	}
}
