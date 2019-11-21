package com.briup.aop.before;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.briup.aop.service.IAccountService;
import com.briup.aop.service.impl.AccountServiceImpl;

//javaConfig 配置类
@Configuration
public class MyBeforeConfig {

	//配置目标对象
	@Bean
	public IAccountService target() {
		return new AccountServiceImpl();
	}
	//配置  前置通知
	@Bean
	public MethodBeforeAdvice beforeAdvice() {
		return new MyBeforeAdvice();
	}
	//配置代理对象
	@Bean
	public ProxyFactoryBean proxy(IAccountService target) throws Exception {
		
		ProxyFactoryBean p = new ProxyFactoryBean();
		//代理类 持有的 目标对象
		p.setTarget(target);
		//代理类 后期 需要实现的接口
		Class<?>[] proxyInterfaces = 
				target.getClass().getInterfaces();
		
		p.setProxyInterfaces(proxyInterfaces);
		//代理类 需要 执行的非业务逻辑代码
		p.setInterceptorNames("beforeAdvice");
		
		return p;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







