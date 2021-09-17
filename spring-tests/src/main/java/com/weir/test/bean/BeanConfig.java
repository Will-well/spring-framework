package com.weir.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author weir
 */
@Configuration
@ComponentScan(basePackages = "com.weir.test")
public class BeanConfig {
	@Bean
	public Person person() {
		Person person = new Person();
		person.setAge(12);
		person.setName("Brian");
		return person;
	}
}
