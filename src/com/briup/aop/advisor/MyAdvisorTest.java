package com.briup.aop.advisor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.briup.aop.service.IAccountService;

public class MyAdvisorTest {
public static void main(String[] args) throws Exception {
	
	AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyAdvisorConfig.class);
	
	IAccountService bean = (IAccountService) ioc.getBean("proxy");
	
	//切入点 :被代理
	//AccountServiceImpl
	//bean.bankAction();// 是否符合 增强器 约束？
	
	//不是切入点  : 不会被代理
	bean.show();
	
	
}
}
