package com.example.demo.design.builder.example.person;

/**
 * <h3>概要:</h3><p>PersonModel</p>
 * <h3>功能:</h3><p>PersonModel</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public class PersonModel {

	private String realName;
	private String nickName;
	private String email;
	private String domainUrl;

	@Override
	public String toString() {
		StringBuffer content = new StringBuffer();
		content.append("Person[");
		content.append("realName = ").append(this.realName).append(", ");
		content.append("nickName = ").append(this.nickName).append(", ");
		content.append("email = ").append(this.email).append(", ");
		content.append("domainUrl = ").append(this.domainUrl).append("]");
		return content.toString();
	}
	
	// GET 和 SET 方法
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomainUrl() {
		return domainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}
}
