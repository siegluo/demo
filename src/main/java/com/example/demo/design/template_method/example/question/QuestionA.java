package com.example.demo.design.template_method.example.question;

/**
 * <h3>概要:</h3><p>QuestionA</p>
 * <h3>功能:</h3><p>QuestionA</p>
 * <h3>履历:</h3>
 * <li>2016年8月5日  v0.1 版本内容: 新建</li>
 */
public class QuestionA extends Question{

	@Override
	public void singleChoice() {
		System.out.println("QuestionA: 单选题");
	}

	@Override
	public void multiChoice() {
		System.out.println("QuestionA: 多选题");
	}
}
