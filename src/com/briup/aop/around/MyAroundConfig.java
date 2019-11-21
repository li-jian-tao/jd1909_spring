package com.briup.aop.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.briup.aop.service.IAccountService;
import com.briup.aop.service.impl.AccountServiceImpl;

//配置类
@Configuration
public class MyAroundConfig {
	//获得目标对象
	@Bean
	public IAccountService target() {
		return new AccountServiceImpl();
	}
	//获得通知
	@Bean
	public MethodInterceptor aroundAdvice() {
		return new  MyAroundAdvice();
	}
	//配置代理对象
	@Bean
	public ProxyFactoryBean 
	       proxy(IAccountService target) throws Exception {
		
		ProxyFactoryBean factory =
				new ProxyFactoryBean();
		
		factory.setTarget(target);
		
		factory.setProxyInterfaces(target.getClass().getInterfaces());
		
		factory.setInterceptorNames("aroundAdvice");
		
		return factory;
	} 
	
	
	
	
	
	
	
	
	 
	
	
}







