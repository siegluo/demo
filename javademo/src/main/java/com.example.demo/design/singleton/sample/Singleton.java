package com.example.demo.design.singleton.sample;

/**
 * <h3>概要:</h3><p>Singleton</p>
 * <h3>功能:</h3><p>单例模式【饿汉式 】</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}
}