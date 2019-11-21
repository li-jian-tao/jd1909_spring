package com.briup.aop.throwException;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

import com.briup.aop.aspect_切面类.MyAspect;

public class ThrowingAdvice implements ThrowsAdvice{
	
	private MyAspect aspect;

	public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
		
		aspect.hg();
	}
	
	/*
	public void afterThrowing(Exception ex) {
		
	}
	*/
	
}
