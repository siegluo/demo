package com.example.demo.design.state.example.event;

/**
 * <h3>概要:</h3><p>EventEnum</p>
 * <h3>功能:</h3><p>事件枚举</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public enum EventEnum {
	// 未连接
	UNCONNECT(1, "UNCONNECT"), 
	// 已连接
	CONNECT(2, "CONNECT"), 
	// 注册中
	REGISTING(3, "REGISTING"), 
	// 已注册
	REGISTED(4, "REGISTED");
    
	private int key;
	private String value;

    EventEnum(int key, String value) {
    	this.key = key;
        this.value = value;
    }

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "state["+ key +", " + value + "]";
	}
}
