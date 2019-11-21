package com.briup.aop.autoProxy;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.briup.aop.aspect_切面类.MyAspect;
import com.briup.aop.before.MyBeforeAdvice;
import com.briup.aop.cglibproxy_3.BuyService;
import com.briup.aop.service.IAccountService;
import com.briup.aop.service.impl.AccountServiceImpl;

//自动配置 代理对象

@Configuration // ioc容器 的配置
//读取这些包下面的 组件注解 和自动注入注解
@ComponentScan(basePackages = {"com.briup.aop.service.impl","com.briup.aop.cglibproxy_3","com.briup.aop.aspect_切面类","com.briup.aop.before"})
public class MyAutoConfig {

	// 目标对象
//	@Bean
//	public IAccountService t1() {
//		return new AccountServiceImpl();
//	}
	//目标对象2 BuyService
//	@Bean
//	public BuyService t2() {
//		return new BuyService();
//	}
	
	
	

	// 通知 前置通知
//	@Bean
//	public MethodBeforeAdvice before(MyAspect as) {
//		MyBeforeAdvice before = new MyBeforeAdvice();
//		before.setAs(as);
//		return before;
//	}

	// 切面类 配置过来
//	@Bean
//	public MyAspect as() {
//		return new MyAspect();
//	}

	// 配置增强器
	@Bean
	public RegexpMethodPointcutAdvisor advisor(MethodBeforeAdvice advice) {
		// 增强器
		RegexpMethodPointcutAdvisor r = new RegexpMethodPointcutAdvisor();
		// 被增强 的 通知
		r.setAdvice(advice);
		// 增强器 的 规则
		r.setPatterns(".*tion",".*y");
		return r;
	}
	
	//自动代理  : 切入点属于的类会被自动代理
//	@Bean
//	public DefaultAdvisorAutoProxyCreator crea() {
//		return new DefaultAdvisorAutoProxyCreator();
//	}
	//自动代理byName : 切入点属于的类,t1 id的对象才会被代理
	@Bean
	public BeanNameAutoProxyCreator creaName() {
		BeanNameAutoProxyCreator bn = 
			new BeanNameAutoProxyCreator();
		//设置被代理的beanId
		bn.setBeanNames("*3*");
		//设置生效的增强器
		bn.setInterceptorNames("advisor");
		return bn;
	}
	@Bean
	public IAccountService t3() {
		return new AccountServiceImpl();
	}
	@Bean
	public IAccountService t4() {
		return new AccountServiceImpl();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
