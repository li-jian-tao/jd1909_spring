package com.briup.aop.cglibproxy_3;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

//cglib 动态代理
public class Test3 {
	public static void main(String[] args) throws Exception {

		// 目标对象 没有实现某一个接口
		BuyService ser = new BuyService();

		// 产生cglib代理对象
		Enhancer en = new Enhancer();
		// 设置代理类的 父类
		en.setSuperclass(ser.getClass());
		// 代理类要在目标方法前执行的代码
		en.setCallback(new MyMethod());
		//创建代理对象
		BuyService create = (BuyService) en.create();
		
		create.buy();
		
		System.out.println(create.getClass());
		
	}//main end
}// class end

class MyMethod implements MethodInterceptor{

	@Override
	public Object intercept(
		Object target, 
		Method method, 
		Object[] args, 
		MethodProxy proxy) throws Throwable {
		
		System.out.println("目标方法前");
		
		//调用父类中的目标方法
		Object result = proxy.invokeSuper(target, args);
				
		System.out.println("目标方法吼吼吼");
		
		return result;
	}
	
}





