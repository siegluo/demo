package com.example.demo.design.chain.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class Client {

	public static void main(String[] args) {
		Handler handler = getChains();
		handler.handleRequest("ConcreteHandler1");
		System.out.println("==========");
		handler.handleRequest("ConcreteHandler2");
	}

	private static Handler getChains(){
		Handler concreteHandler1 = new ConcreteHandler1();
		Handler concreteHandler2 = new ConcreteHandler2();
		concreteHandler1.setHandler(concreteHandler2);
		return concreteHandler1;
	}
}
