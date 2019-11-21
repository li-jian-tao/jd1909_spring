package com.briup.test;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class MyyyBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object obj) throws Throwable {
		System.out.println("这个代码会在目标方法前执行");
	}
	
}
