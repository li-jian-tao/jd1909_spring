package com.briup.test.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ta {
public static void main(String[] args) throws Exception {
	
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
	UserService userService= (UserService) applicationContext.getBean("userService");
	userService.print();
}
}
