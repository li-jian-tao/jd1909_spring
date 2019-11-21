package com.briup.aop.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//环绕通知
public class MyAroundAdvice implements MethodInterceptor{
	//需要手动调用目标方法
	@Override
	public Object invoke(MethodInvocation in) throws Throwable {
		System.out.println("目标方法前很多代码");
		
		//手动调用目标方法
		Object result = in.proceed();
		
		
		System.out.println("目标方法吼吼吼很多代码");
		return result;
	}
	

}
