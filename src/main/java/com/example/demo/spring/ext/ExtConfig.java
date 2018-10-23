package com.example.demo.spring.ext;

import java.util.concurrent.Executor;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

import com.example.demo.spring.bean.Blue;

/**
 * À©Õ¹Ô­Àí£º
 * BeanPostProcessor£ºbeanºóÖÃ´¦ÀíÆ÷£¬bean´´½¨¶ÔÏó³õÊ¼»¯Ç°ºó½øÐÐÀ¹½Ø¹¤×÷µÄ
 *
 * 1¡¢BeanFactoryPostProcessor£ºbeanFactoryµÄºóÖÃ´¦ÀíÆ÷£»
 * 		ÔÚBeanFactory±ê×¼³õÊ¼»¯Ö®ºóµ÷ÓÃ£¬À´¶¨ÖÆºÍÐÞ¸ÄBeanFactoryµÄÄÚÈÝ£»
 * 		ËùÓÐµÄbean¶¨ÒåÒÑ¾­±£´æ¼ÓÔØµ½beanFactory£¬µ«ÊÇbeanµÄÊµÀý»¹Î´´´½¨
 *
 *
 * BeanFactoryPostProcessorÔ­Àí:
 * 1)¡¢iocÈÝÆ÷´´½¨¶ÔÏó
 * 2)¡¢invokeBeanFactoryPostProcessors(beanFactory);
 * 		ÈçºÎÕÒµ½ËùÓÐµÄBeanFactoryPostProcessor²¢Ö´ÐÐËûÃÇµÄ·½·¨£»
 * 			1£©¡¢Ö±½ÓÔÚBeanFactoryÖÐÕÒµ½ËùÓÐÀàÐÍÊÇBeanFactoryPostProcessorµÄ×é¼þ£¬²¢Ö´ÐÐËûÃÇµÄ·½·¨
 * 			2£©¡¢ÔÚ³õÊ¼»¯´´½¨ÆäËû×é¼þÇ°ÃæÖ´ÐÐ
 *
 * 2¡¢BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
 * 		postProcessBeanDefinitionRegistry();
 * 		ÔÚËùÓÐbean¶¨ÒåÐÅÏ¢½«Òª±»¼ÓÔØ£¬beanÊµÀý»¹Î´´´½¨µÄ£»
 *
 * 		ÓÅÏÈÓÚBeanFactoryPostProcessorÖ´ÐÐ£»
 * 		ÀûÓÃBeanDefinitionRegistryPostProcessor¸øÈÝÆ÷ÖÐÔÙ¶îÍâÌí¼ÓÒ»Ð©×é¼þ£»
 *
 * 	Ô­Àí£º
 * 		1£©¡¢ioc´´½¨¶ÔÏó
 * 		2£©¡¢refresh()-¡·invokeBeanFactoryPostProcessors(beanFactory);
 * 		3£©¡¢´ÓÈÝÆ÷ÖÐ»ñÈ¡µ½ËùÓÐµÄBeanDefinitionRegistryPostProcessor×é¼þ¡£
 * 			1¡¢ÒÀ´Î´¥·¢ËùÓÐµÄpostProcessBeanDefinitionRegistry()·½·¨
 * 			2¡¢ÔÙÀ´´¥·¢postProcessBeanFactory()·½·¨BeanFactoryPostProcessor£»
 *
 * 		4£©¡¢ÔÙÀ´´ÓÈÝÆ÷ÖÐÕÒµ½BeanFactoryPostProcessor×é¼þ£»È»ºóÒÀ´Î´¥·¢postProcessBeanFactory()·½·¨
 *
 * 3¡¢ApplicationListener£º¼àÌýÈÝÆ÷ÖÐ·¢²¼µÄÊÂ¼þ¡£ÊÂ¼þÇý¶¯Ä£ÐÍ¿ª·¢£»
 * 	  public interface ApplicationListener<E extends ApplicationEvent>
 * 		¼àÌý ApplicationEvent ¼°ÆäÏÂÃæµÄ×ÓÊÂ¼þ£»
 *
 * 	 ²½Öè£º
 * 		1£©¡¢Ð´Ò»¸ö¼àÌýÆ÷£¨ApplicationListenerÊµÏÖÀà£©À´¼àÌýÄ³¸öÊÂ¼þ£¨ApplicationEvent¼°Æä×ÓÀà£©
 * 			@EventListener;
 * 			Ô­Àí£ºÊ¹ÓÃEventListenerMethodProcessor´¦ÀíÆ÷À´½âÎö·½·¨ÉÏµÄ@EventListener£»
 *
 * 		2£©¡¢°Ñ¼àÌýÆ÷¼ÓÈëµ½ÈÝÆ÷£»
 * 		3£©¡¢Ö»ÒªÈÝÆ÷ÖÐÓÐÏà¹ØÊÂ¼þµÄ·¢²¼£¬ÎÒÃÇ¾ÍÄÜ¼àÌýµ½Õâ¸öÊÂ¼þ£»
 * 				ContextRefreshedEvent£ºÈÝÆ÷Ë¢ÐÂÍê³É£¨ËùÓÐbean¶¼ÍêÈ«´´½¨£©»á·¢²¼Õâ¸öÊÂ¼þ£»
 * 				ContextClosedEvent£º¹Ø±ÕÈÝÆ÷»á·¢²¼Õâ¸öÊÂ¼þ£»
 * 		4£©¡¢·¢²¼Ò»¸öÊÂ¼þ£º
 * 				applicationContext.publishEvent()£»
 *
 *  Ô­Àí£º
 *  	ContextRefreshedEvent¡¢IOCTest_Ext$1[source=ÎÒ·¢²¼µÄÊ±¼ä]¡¢ContextClosedEvent£»
 *  1£©¡¢ContextRefreshedEventÊÂ¼þ£º
 *  	1£©¡¢ÈÝÆ÷´´½¨¶ÔÏó£ºrefresh()£»
 *  	2£©¡¢finishRefresh();ÈÝÆ÷Ë¢ÐÂÍê³É»á·¢²¼ContextRefreshedEventÊÂ¼þ
 *  2£©¡¢×Ô¼º·¢²¼ÊÂ¼þ£»
 *  3£©¡¢ÈÝÆ÷¹Ø±Õ»á·¢²¼ContextClosedEvent£»
 *
 *  ¡¾ÊÂ¼þ·¢²¼Á÷³Ì¡¿£º
 *  	3£©¡¢publishEvent(new ContextRefreshedEvent(this));
 *  			1£©¡¢»ñÈ¡ÊÂ¼þµÄ¶à²¥Æ÷£¨ÅÉ·¢Æ÷£©£ºgetApplicationEventMulticaster()
 *  			2£©¡¢multicastEventÅÉ·¢ÊÂ¼þ£º
 *  			3£©¡¢»ñÈ¡µ½ËùÓÐµÄApplicationListener£»
 *  				for (final ApplicationListener<?> listener : getApplicationListeners(event, type)) {
 *  				1£©¡¢Èç¹ûÓÐExecutor£¬¿ÉÒÔÖ§³ÖÊ¹ÓÃExecutor½øÐÐÒì²½ÅÉ·¢£»
 *  					Executor executor = getTaskExecutor();
 *  				2£©¡¢·ñÔò£¬Í¬²½µÄ·½Ê½Ö±½ÓÖ´ÐÐlistener·½·¨£»invokeListener(listener, event);
 *  				 ÄÃµ½listener»Øµ÷onApplicationEvent·½·¨£»
 *
 *  ¡¾ÊÂ¼þ¶à²¥Æ÷£¨ÅÉ·¢Æ÷£©¡¿
 *  	1£©¡¢ÈÝÆ÷´´½¨¶ÔÏó£ºrefresh();
 *  	2£©¡¢initApplicationEventMulticaster();³õÊ¼»¯ApplicationEventMulticaster£»
 *  		1£©¡¢ÏÈÈ¥ÈÝÆ÷ÖÐÕÒÓÐÃ»ÓÐid=¡°applicationEventMulticaster¡±µÄ×é¼þ£»
 *  		2£©¡¢Èç¹ûÃ»ÓÐthis.applicationEventMulticaster = new SimpleApplicationEventMulticaster(beanFactory);
 *  			²¢ÇÒ¼ÓÈëµ½ÈÝÆ÷ÖÐ£¬ÎÒÃÇ¾Í¿ÉÒÔÔÚÆäËû×é¼þÒªÅÉ·¢ÊÂ¼þ£¬×Ô¶¯×¢ÈëÕâ¸öapplicationEventMulticaster£»
 *
 *  ¡¾ÈÝÆ÷ÖÐÓÐÄÄÐ©¼àÌýÆ÷¡¿
 *  	1£©¡¢ÈÝÆ÷´´½¨¶ÔÏó£ºrefresh();
 *  	2£©¡¢registerListeners();
 *  		´ÓÈÝÆ÷ÖÐÄÃµ½ËùÓÐµÄ¼àÌýÆ÷£¬°ÑËûÃÇ×¢²áµ½applicationEventMulticasterÖÐ£»
 *  		String[] listenerBeanNames = getBeanNamesForType(ApplicationListener.class, true, false);
 *  		//½«listener×¢²áµ½ApplicationEventMulticasterÖÐ
 *  		getApplicationEventMulticaster().addApplicationListenerBean(listenerBeanName);
 *
 *   SmartInitializingSingleton Ô­Àí£º->afterSingletonsInstantiated();
 *   		1£©¡¢iocÈÝÆ÷´´½¨¶ÔÏó²¢refresh()£»
 *   		2£©¡¢finishBeanFactoryInitialization(beanFactory);³õÊ¼»¯Ê£ÏÂµÄµ¥ÊµÀýbean£»
 *   			1£©¡¢ÏÈ´´½¨ËùÓÐµÄµ¥ÊµÀýbean£»getBean();
 *   			2£©¡¢»ñÈ¡ËùÓÐ´´½¨ºÃµÄµ¥ÊµÀýbean£¬ÅÐ¶ÏÊÇ·ñÊÇSmartInitializingSingletonÀàÐÍµÄ£»
 *   				Èç¹ûÊÇ¾Íµ÷ÓÃafterSingletonsInstantiated();
 *
 *
 *
 */
@ComponentScan("com.example.demo.spring.ext")
@Configuration
public class ExtConfig {

	@Bean
	public Blue blue(){
		return new Blue();
	}

}
