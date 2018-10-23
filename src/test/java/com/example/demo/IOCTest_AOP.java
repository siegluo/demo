package com.example.demo;

import com.example.demo.spring.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.spring.aop.MathCalculator;
import com.example.demo.spring.bean.Boss;
import com.example.demo.spring.bean.Car;
import com.example.demo.spring.bean.Color;
import com.example.demo.spring.bean.Red;
import com.example.demo.spring.dao.BookDao;
import com.example.demo.spring.service.BookService;

public class IOCTest_AOP {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
		
		mathCalculator.div(1, 0);
		
		applicationContext.close();
	}

}
