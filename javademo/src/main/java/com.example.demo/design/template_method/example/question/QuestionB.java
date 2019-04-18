package com.example.demo.design.template_method.example.question;

/**
 * <h3>概要:</h3><p>QuestionB</p>
 * <h3>功能:</h3><p>QuestionB</p>
 * <h3>履历:</h3>
 * <li>2016年8月5日  v0.1 版本内容: 新建</li>
 */
public class QuestionB extends Question{

	@Override
	public void singleChoice() {
		System.out.println("QuestionB: 单选题");
	}

	@Override
	public void multiChoice() {
		System.out.println("QuestionB: 多选题");
	}
	
	@Override
	public void hock() {
		System.out.println("QuestionB: 判断题");
		System.out.println("QuestionB: 问答题");
	}
}
