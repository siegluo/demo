package com.example.demo.design.chain.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>概要:</h3><p>FilterChain</p>
 * <h3>功能:</h3><p>责任链</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class FilterChain {
	List<Filter> filters = new ArrayList<Filter>();

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	public String doFilter(String msg) {
		if (null != msg && !("").equals(msg.trim())) {
			for (Filter filter : filters) {
				msg = filter.doFilter(msg);
			}
		}
		return msg;
	}
}