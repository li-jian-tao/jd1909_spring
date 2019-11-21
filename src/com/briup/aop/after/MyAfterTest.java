package com.briup.aop.after;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.briup.aop.service.IAccountService;

public class MyAfterTest {
public static void main(String[] args) throws Exception {

	
	
	
	
//javaConfig 
ApplicationContext ioc = new AnnotationConfigApplicationContext(MyAfterConfig.class);

//从容器中获得代理对象
IAccountService ser = (IAccountService) 
	ioc.getBean("proxy");

ser.bankAction();










	
	
}
}







