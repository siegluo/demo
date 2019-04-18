package com.example.demo.design.chain.sample;

/**
 * <h3>概要:</h3><p>Handler</p>
 * <h3>功能:</h3><p>处理者</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public abstract class Handler {
	// 后继的责任对象
	protected Handler next;

	public void setHandler(Handler next){
		this.next = next;
	}

	public void handleRequest(String request) {
		if (next != null) {
			next.handleRequest(request);
		}
	}
}
