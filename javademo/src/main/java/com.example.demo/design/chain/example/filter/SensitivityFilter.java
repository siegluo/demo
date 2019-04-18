package com.example.demo.design.chain.example.filter;

/**
 * <h3>概要:</h3><p>SensitivityFilter</p>
 * <h3>功能:</h3><p>敏感字过滤器</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class SensitivityFilter extends Filter{
	@Override
	public String doFilter(String msg) {
		msg = msg.replace("敏感", "(x)");
		return msg;
	}
}