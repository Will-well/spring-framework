package com.weir.source;
import com.weir.source.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocExample {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = context.getBean(User.class);
		System.out.println("user = " + user);

	}
}
