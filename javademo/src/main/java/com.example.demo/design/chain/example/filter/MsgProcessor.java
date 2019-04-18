package com.example.demo.design.chain.example.filter;

/**
 * <h3>概要:</h3><p>MsgProcessor</p>
 * <h3>功能:</h3><p>处理类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class MsgProcessor {
	private String msg;

	private FilterChain filterChain;

	public MsgProcessor(String msg, FilterChain filterChain) {
		this.filterChain = filterChain;
		this.msg = msg;
	}

	public String processor() {
		return filterChain.doFilter(msg);
	}
}