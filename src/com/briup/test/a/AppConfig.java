package com.briup.test.a;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.briup.test.MyyyBeforeAdvice;

@Configuration
public class AppConfig {
	//要创建代理的目标Bean
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
	//创建Advice
	@Bean
	public Advice beforeAdvice(){
		return new MyyyBeforeAdvice();
	}
	//使用Advice创建Advisor

	@Bean
	public RegexpMethodPointcutAdvisor advisor() {
		RegexpMethodPointcutAdvisor advisor = 
				new RegexpMethodPointcutAdvisor(beforeAdvice());
		//advisor.setPatterns(".*ow");//以ow结尾
		//advisor.setPatterns(".*o.*");//包含o
		advisor.setPatterns(".*int");//
		
		return advisor;
	}
	
	
	@Bean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
		return new DefaultAdvisorAutoProxyCreator();
	}
}
