package com.briup.aop.around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.briup.aop.service.IAccountService;

public class MyAroundTest {
public static void main(String[] args) throws Exception {

AnnotationConfigApplicationContext ioc =
	new AnnotationConfigApplicationContext(MyAroundConfig.class);

IAccountService bean = (IAccountService) 
	ioc.getBean("proxy");
bean.bankAction();

	
	
	
}
}
