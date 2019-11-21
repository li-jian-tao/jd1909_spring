package com.briup.aop.advisor;

import javax.swing.PopupFactory;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.briup.aop.aspect_切面类.MyAspect;
import com.briup.aop.before.MyBeforeAdvice;
import com.briup.aop.service.IAccountService;
import com.briup.aop.service.impl.AccountServiceImpl;

import aj.org.objectweb.asm.MethodAdapter;

//配置类
@Configuration
public class MyAdvisorConfig {
	
	//目标对象
	@Bean
	public IAccountService target() {
		return new AccountServiceImpl();
	} 
	//通知 前置通知
	@Bean
	public MethodBeforeAdvice before(MyAspect as) {
	  MyBeforeAdvice before = new MyBeforeAdvice();
	  before.setAs(as);
	  return before;
	}
	//切面类 配置过来
	@Bean
	public MyAspect as() {
		return new MyAspect();
	}
	
	//配置增强器
	@Bean
	public RegexpMethodPointcutAdvisor 
			advisor(MethodBeforeAdvice advice) {
		//增强器
		RegexpMethodPointcutAdvisor r =
			 new RegexpMethodPointcutAdvisor();
		//被增强 的 通知
		r.setAdvice(advice);
		//增强器 的 规则
		r.setPatterns(".*tion");		
		return r;
	}
	
	@Bean
	public ProxyFactoryBean proxy(IAccountService target) throws Exception {
		ProxyFactoryBean p =new ProxyFactoryBean();
		p.setTarget(target);
		p.setProxyInterfaces(target.getClass().getInterfaces());
		p.setInterceptorNames("advisor");
		return p;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}












