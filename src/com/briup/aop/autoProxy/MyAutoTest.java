package com.briup.aop.autoProxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.briup.aop.cglibproxy_3.BuyService;
import com.briup.aop.service.IAccountService;

public class MyAutoTest {
public static void main(String[] args) throws Exception {
	
	//使用MyAutoConfig构建ioc容器
	AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyAutoConfig.class);
	
	//System.out.println(ioc.getBean("crea").getClass());
	//自动代理
	System.out.println(ioc.getBean("t1").getClass());
	//直接获取目标对象，springaop会自动对目标对象 代理,返回的是代理对象
	IAccountService t1 = (IAccountService) ioc.getBean("t1");
	
	t1.bankAction();
	t1.show();
	
	BuyService t2 = (BuyService) ioc.getBean("t2");
	System.out.println(t2.getClass());
	
	t2.buy();
	System.out.println("---------------------");
	
	
	System.out.println(ioc.getBean("t1").getClass());
	System.out.println(ioc.getBean("t2").getClass());
	System.out.println(ioc.getBean("t3").getClass());
	System.out.println(ioc.getBean("t4").getClass());
	
	
	
	
	
	
	
	
	
	
	
	
}
}
