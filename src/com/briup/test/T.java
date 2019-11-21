package com.briup.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class T {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext ioc = 
		 new AnnotationConfigApplicationContext(AopMyConfig.class);
		IStudentService bean = (IStudentService) ioc.getBean("target");
		bean.myow();
	}
}
