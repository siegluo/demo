package com.example.demo.design.template_method.example.question;

/**
 * <h3>概要:</h3><p>Question</p>
 * <h3>功能:</h3><p>抽象父类</p>
 * <h3>履历:</h3>
 * <li>2016年8月5日  v0.1 版本内容: 新建</li>
 */
public abstract class Question {
	
	public final void make(){
		singleChoice();
		multiChoice();
		hock();
	}
	
	public abstract void singleChoice();
	
	public abstract void multiChoice();
	
	public void hock(){}
}
