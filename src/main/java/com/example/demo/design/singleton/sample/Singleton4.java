package com.example.demo.design.singleton.sample;

/** 
 * <h3>概要:</h3><p>Singleton4</p>
 * <h3>功能:</h3><p>单例模式【双重检验锁】</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Singleton4 {

	private Singleton4(){}
	
	private static Singleton4 instance = null;
	
	public static Singleton4 getInstance(){
		if(instance == null){
		    synchronized(Singleton4.class){
		        if(instance == null){
		        	instance = new Singleton4();
		        }
		    }	
		}
		return instance;
	}
}
