package com.example.demo.design.chain.example.filter;

/**
 * <h3>概要:</h3><p>Filter</p>
 * <h3>功能:</h3><p>过滤器</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public abstract class Filter {

	protected Filter filter;

	public void addLast(Filter filter) {
		this.filter = filter;
	}

	public abstract String doFilter(String msg);
}
