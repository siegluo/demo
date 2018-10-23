package com.example.demo.design.chain.example.filter;

/**
 * <h3>概要:</h3><p>HTMLFilter</p>
 * <h3>功能:</h3><p>HTML过滤器</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class HTMLFilter extends Filter {
	@Override
	public String doFilter(String msg) {
		msg = msg.replace("\"", "&quot;")
				.replace("\\", "&gt;"
				).replace("<", "&lt;")
				.replace(">", "&gt;")
				.replace("&", "&amp;");
		return msg;
	}
}
