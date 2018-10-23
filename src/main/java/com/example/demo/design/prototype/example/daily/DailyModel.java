package com.example.demo.design.prototype.example.daily;

/**
 * <h3>概要:</h3><p>DailyModel</p>
 * <h3>功能:</h3><p>日报模型</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class DailyModel implements Cloneable{

	private String author;
	private String content;

	@Override
	public DailyModel clone(){
		try {
			DailyModel dailyModel = (DailyModel) super.clone();
			return dailyModel;
		} catch (CloneNotSupportedException e) {
			System.out.println("不支持复制！");
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuffer content = new StringBuffer();
		content.append("Daily[");
		content.append("author = ").append(this.author).append(", ");
		content.append("content = ").append(this.content).append("]");
		return content.toString();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
