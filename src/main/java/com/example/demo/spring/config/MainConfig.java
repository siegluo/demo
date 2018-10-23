package com.example.demo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;

import com.example.demo.spring.bean.Person;

@Configuration
@ComponentScans(
		value = {
				@ComponentScan(value="com.example.demo.spring",includeFilters = {
/*						@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
						@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
				},useDefaultFilters = false)	
		}
		)
//@ComponentScan
//excludeFilters = Filter[]
//includeFilters = Filter[]
//FilterType.ANNOTATION
//FilterType.ASSIGNABLE_TYPE
//FilterType.ASPECTJ
//FilterType.REGEX
//FilterType.CUSTOM
public class MainConfig {
	
	@Bean("person")
	public Person person01(){
		return new Person("lisi", 20);
	}

}
