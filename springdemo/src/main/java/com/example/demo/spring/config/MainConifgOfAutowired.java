package com.example.demo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.spring.bean.Car;
import com.example.demo.spring.bean.Color;
import com.example.demo.spring.dao.BookDao;


/**
 * 自动装配;
 * 		Spring利用依赖注入（DI），完成对IOC容器中中各个组件的依赖关系赋值；
 *
 * 1）、@Autowired：自动注入：
 * 		1）、默认优先按照类型去容器中找对应的组件:applicationContext.getBean(BookDao.class);找到就赋值
 * 		2）、如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 * 							applicationContext.getBean("bookDao")
 * 		3）、@Qualifier("bookDao")：使用@Qualifier指定需要装配的组件的id，而不是使用属性名
 * 		4）、自动装配默认一定要将属性赋值好，没有就会报错；
 * 			可以使用@Autowired(required=false);
 * 		5）、@Primary：让Spring进行自动装配的时候，默认使用首选的bean；
 * 				也可以继续使用@Qualifier指定需要装配的bean的名字
 * 		BookService{
 * 			@Autowired
 * 			BookDao  bookDao;
 * 		}
 *
 * 2）、Spring还支持使用@Resource(JSR250)和@Inject(JSR330)[java规范的注解]
 * 		@Resource:
 * 			可以和@Autowired一样实现自动装配功能；默认是按照组件名称进行装配的；
 * 			没有能支持@Primary功能没有支持@Autowired（reqiured=false）;
 * 		@Inject:
 * 			需要导入javax.inject的包，和Autowired的功能一样。没有required=false的功能；
 *  @Autowired:Spring定义的； @Resource、@Inject都是java规范
 *
 * AutowiredAnnotationBeanPostProcessor:解析完成自动装配功能；
 *
 * 3）、 @Autowired:构造器，参数，方法，属性；都是从容器中获取参数组件的值
 * 		1）、[标注在方法位置]：@Bean+方法参数；参数从容器中获取;默认不写@Autowired效果是一样的；都能自动装配
 * 		2）、[标在构造器上]：如果组件只有一个有参构造器，这个有参构造器的@Autowired可以省略，参数位置的组件还是可以自动从容器中获取
 * 		3）、放在参数位置：
 *
 * 4）、自定义组件想要使用Spring容器底层的一些组件（ApplicationContext，BeanFactory，xxx）；
 * 		自定义组件实现xxxAware；在创建对象的时候，会调用接口规定的方法注入相关组件；Aware；
 * 		把Spring底层一些组件注入到自定义的Bean中；
 * 		xxxAware：功能使用xxxProcessor；
 * 			ApplicationContextAware==》ApplicationContextAwareProcessor；
 *
 *
 *
 */
@Configuration
@ComponentScan({"com.example.demo.spring.service","com.example.demo.spring.dao",
		"com.example.demo.spring.controller","com.example.demo.spring.bean"})
public class MainConifgOfAutowired {

	@Primary
	@Bean("bookDao2")
	public BookDao bookDao(){
		BookDao bookDao = new BookDao();
		bookDao.setLable("2");
		return bookDao;
	}

	/**
	 * @Bean标注的方法创建对象的时候，方法参数的值从容器中获取
	 * @param car
	 * @return
	 */
	@Bean
	public Color color(Car car){
		Color color = new Color();
		color.setCar(car);
		return color;
	}


}
