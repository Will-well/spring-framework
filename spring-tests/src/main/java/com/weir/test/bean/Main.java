package com.weir.test.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weir
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println("bean = " + bean);
	}
}
