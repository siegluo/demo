package com.example.demo.design.prototype.example.daily2;

import java.io.Serializable;

/**
 * <h3>概要:</h3><p>AttachmentModel</p>
 * <h3>功能:</h3><p>附件模型</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
@SuppressWarnings("serial")
public class AttachmentModel implements Serializable{

	private String name;
	
	@Override
	public String toString() {
		StringBuffer content = new StringBuffer();
		content.append("Attachment[");
		content.append("name = ").append(this.name).append("] ");
		return content.toString();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
