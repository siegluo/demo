package com.example.demo.design.builder.example.person;

/**
 * <h3>概要:</h3><p>PersonModel3</p>
 * <h3>功能:</h3><p>PersonModel3</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public class PersonModel3 {

	private String realName;
	private String nickName;
	private String email;
	private String domainUrl;
	
	public PersonModel3(Builder builder) {
		realName = builder.realName;
		nickName = builder.nickName;
		email = builder.email;
		domainUrl = builder.domainUrl;
	}
	
	public static class Builder {
		private String realName;
		private String nickName;
		private String email;
		private String domainUrl;
		
		public Builder setRealName(String realName) {
			this.realName = realName;
			return this;
		}
		
		public Builder setNickName(String nickName) {
			this.nickName = nickName;
			return this;
		}
		
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder setDomainUrl(String domainUrl) {
			this.domainUrl = domainUrl;
			return this;
		}		
		
		public PersonModel3 build() {
			return new PersonModel3(this);
		}
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