package com.example.demo.design.singleton.sample;

/** 
 * <h3>概要:</h3><p>Singleton2</p>
 * <h3>功能:</h3><p>单例模式【懒汉式】</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Singleton2 {

	private Singleton2(){}
	
	private static Singleton2 instance = null;
	
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
