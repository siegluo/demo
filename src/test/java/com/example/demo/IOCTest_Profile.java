package com.example.demo;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.spring.bean.Boss;
import com.example.demo.spring.bean.Car;
import com.example.demo.spring.bean.Color;
import com.example.demo.spring.bean.Red;
import com.example.demo.spring.bean.Yellow;
import com.example.demo.spring.config.MainConfigOfProfile;
import com.example.demo.spring.config.MainConifgOfAutowired;
import com.example.demo.spring.dao.BookDao;
import com.example.demo.spring.service.BookService;

public class IOCTest_Profile {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles("dev");
		applicationContext.register(MainConfigOfProfile.class);
		applicationContext.refresh();
		
		
		String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
		for (String string : namesForType) {
			System.out.println(string);
		}
		
		Yellow bean = applicationContext.getBean(Yellow.class);
		System.out.println(bean);
		applicationContext.close();
	}

}
