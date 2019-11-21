package com.briup.aop.after;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.service.IAccountService;

public class MyAfterTestXml {
public static void main(String[] args) throws Exception {
	
	String path = "com/briup/aop/after/after.xml";
	ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext(path);
	
	IAccountService bean = (IAccountService) 
			ioc.getBean("proxy");
	
	bean.bankAction();
	
	
	
	
	
	
	
	
}
}
