package com.example.demo;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.spring.aop.MathCalculator;
import com.example.demo.spring.bean.Boss;
import com.example.demo.spring.bean.Car;
import com.example.demo.spring.bean.Color;
import com.example.demo.spring.bean.Red;
import com.example.demo.spring.config.MainConfigOfAOP;
import com.example.demo.spring.config.MainConifgOfAutowired;
import com.example.demo.spring.dao.BookDao;
import com.example.demo.spring.service.BookService;
import com.example.demo.spring.tx.TxConfig;
import com.example.demo.spring.tx.UserService;

public class IOCTest_Tx {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(TxConfig.class);
	
		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.insertUser();
		applicationContext.close();
	}

}
