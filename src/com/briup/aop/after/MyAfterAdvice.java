package com.briup.aop.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice 
	implements AfterReturningAdvice{
	//方法中的代码会被携带到目标分方法 【返回后】 执行
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("方法正常结束");
		System.out.println("返回");
		System.out.println("返回");
		System.out.println("返回");
	}
}
