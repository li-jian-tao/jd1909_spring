package com.briup.aop.after;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.briup.aop.before.MyBeforeAdvice;
import com.briup.aop.service.IAccountService;
import com.briup.aop.service.impl.AccountServiceImpl;

//javaConfig 配置类
@Configuration
public class MyAfterConfig {
   //配置 目标对象
   @Bean
   public IAccountService target() {
	   return new AccountServiceImpl();
   } 
   //配置 返回后通知
   @Bean
   public AfterReturningAdvice afterAdvice() {
	   return new MyAfterAdvice();
   }
   //配置 前置通知
   @Bean
   public MethodBeforeAdvice beforeAdvice() {
	   return new MyBeforeAdvice();
   }
   
   //配置 代理对象
   @Bean
   public ProxyFactoryBean 
   				proxy(IAccountService target)throws Exception {
	   
	   //构建 产生代理对象的工厂
	   ProxyFactoryBean p = new ProxyFactoryBean();
	   //设置目标对象
	   p.setTarget(target);
	   Class<?>[] proxyInterfaces =
			   target.getClass().getInterfaces();
	   //设置 代理类要实现的接口  和 目标类的接口一致
	   p.setProxyInterfaces(proxyInterfaces);
	   //设置 代理类要执行的代码
	   p.setInterceptorNames("afterAdvice","beforeAdvice");
	   
	   return p;
   }
   // setTarget
   // setProxyInterface
   // setInterceptorNames

   
   
   
}















