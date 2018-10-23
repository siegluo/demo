package com.example.demo.design.singleton.sample;

/**
 * <h3>概要:</h3><p>Singleton3</p>
 * <h3>功能:</h3><p>单例模式【懒汉式  线程安全】</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Singleton3 {
   
	private Singleton3(){}
	
	private static Singleton3 instance = null;
	
	public static synchronized Singleton3 getInstance(){
		if(instance == null){
			instance = new Singleton3();
		}
		return instance;
	}
}
