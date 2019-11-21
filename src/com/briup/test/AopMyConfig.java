package com.briup.test;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AopMyConfig {
	
	@Bean
	public IStudentService target() {
		return new StudentServiceImpl();
	}
	@Bean
	public MethodBeforeAdvice beforeAdvice() {
		return new MyyyBeforeAdvice();
	}
	
	//前置通知
//	@Bean
//	public ProxyFactoryBean proxy() throws Exception {
//		System.out.println("..."+service);
//		ProxyFactoryBean pro = new ProxyFactoryBean();
//		Class[] c = {IStudentService.class};
//		pro.setProxyInterfaces(c);
//		pro.setTarget(service);
//		pro.setInterceptorNames("beforeAdvice");
//		return pro;
//	}
	//增强器
	@Bean
	public RegexpMethodPointcutAdvisor advisor() {
		RegexpMethodPointcutAdvisor advisor = 
				new RegexpMethodPointcutAdvisor(beforeAdvice());
		//advisor.setPatterns(".*ow");//以ow结尾
		//advisor.setPatterns(".*o.*");//包含o
		advisor.setPatterns(".*ow");//
		return advisor;
	}
	
//	@Bean
//	public ProxyFactoryBean proxyAdvisor() throws Exception {
//		ProxyFactoryBean pro = new ProxyFactoryBean();
//		Class[] c = {IStudentService.class};
//		pro.setProxyInterfaces(c);
//		pro.setTarget(service);
//		pro.setInterceptorNames("advisor");
//		return pro;
//	}
	
	@Bean
	public DefaultAdvisorAutoProxyCreator create() {
		DefaultAdvisorAutoProxyCreator df = new DefaultAdvisorAutoProxyCreator();
		return df;
	}
	
	
}
