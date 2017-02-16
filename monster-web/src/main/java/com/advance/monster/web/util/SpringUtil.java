package com.advance.monster.web.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * @author KaiGuo
 * @since 2017-02-16 用于获取各种bean的实例
 *
 */
public class SpringUtil implements ApplicationContextAware {

	/** Spring的上下文 */
	private static ApplicationContext applicationContext;

	// 构造器私有化 不让new对象
	private SpringUtil() {
		super();
	}

	// 这个方法Spring会自动调用
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		applicationContext = context;
	}

	/** 获取Spring的上下文 ApplicationContext*/
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	/** 通过bean的名称获取bean */
	public static Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}
	
	/** 通过bean的Class获取bean */
	public static <T> T getBean(Class<T> c) {
		return applicationContext.getBean(c);
	}

	/** 通过bean的名称和Class获取bean */
	public static <T> T getBean(String beanName, Class<T> c) {
		return applicationContext.getBean(beanName, c);
	}

}
