package com.example.demo.design.chain.sample;

/**
 * <h3>概要:</h3><p>ConcreteHandler2</p>
 * <h3>功能:</h3><p>具体处理者</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class ConcreteHandler2 extends Handler{
	@Override
	public void handleRequest(String request) {
		if ("ConcreteHandler2".equals(request)) {
			System.out.println("ConcreteHandler2");
		} else {
			super.handleRequest(request);
		}
	}
}
