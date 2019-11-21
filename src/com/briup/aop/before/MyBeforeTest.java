package com.briup.aop.before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.briup.aop.service.IAccountService;

public class MyBeforeTest {
public static void main(String[] args) throws Exception {

	
	//javaConfig 的形式 生成ioc容器
   AnnotationConfigApplicationContext ioc = 
		   	new AnnotationConfigApplicationContext
                    (MyBeforeConfig.class);
   
   
   IAccountService bean = (IAccountService) 
		   ioc.getBean("proxy");
   
   bean.bankAction();
   
   System.out.println(bean.getClass());
   
	
}
}
