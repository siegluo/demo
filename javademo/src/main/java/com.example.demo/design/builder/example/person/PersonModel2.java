package com.example.demo.design.builder.example.person;

/**
 * <h3>概要:</h3><p>PersonModel2</p>
 * <h3>功能:</h3><p>PersonModel2</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public class PersonModel2 {

	private String realName;
	private String nickName;
	private String email;
	private String domainUrl;

	public PersonModel2(){}
	public PersonModel2(String realName, String nickName, String email, String domainUrl) {
		this.realName = realName;
		this.nickName = nickName;
		this.email = email;
		this.domainUrl = domainUrl;
	}

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
}
