package com.briup.aop.aopConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.service.IAccountService;

public class Test1 {
public static void main(String[] args) throws Exception {
	
	
String path = "com/briup/aop/aopConfig/aopconfig.xml";
ClassPathXmlApplicationContext ioc = 
		new ClassPathXmlApplicationContext(path);
//获得目标对象:如果目标的对象中包含切入点 ，
//那么目标对象就会被自动代理
IAccountService ser = (IAccountService) ioc.getBean("target");

ser.bankAction();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
