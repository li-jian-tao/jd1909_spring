package com.briup.aop.before;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.briup.aop.aspect_切面类.MyAspect;

//前置通知
@Component("beforeAdvice")
public class MyBeforeAdvice 
       implements MethodBeforeAdvice{
	
	//切面类 : 封装了很多代码,这些代码会被通知携带到连接点前后去执行
	@Autowired
	private MyAspect as;
	
	//下面方法中的代码会被携带到目标方法前面执行
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		as.start();	
		//System.out.println("...");
		//System.out.println("...");
		//System.out.println("...");
	}

	
	public MyAspect getAs() {
		return as;
	}

	public void setAs(MyAspect as) {
		this.as = as;
	}
	
	
}
