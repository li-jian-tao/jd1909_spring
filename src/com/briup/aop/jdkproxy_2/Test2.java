package com.briup.aop.jdkproxy_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// jdk动态代理测试类
public class Test2 {

public static void main(String[] args) throws Exception {
	//创建目标对象
	IStudentService ser = new StudentServiceImpl();
	//获得类加载器 ClassLoader
	ClassLoader classLoader =Test2.class.getClassLoader();
	//目标对象实现的接口
	Class<?>[] interfaces = ser.getClass().getInterfaces();
	//配置代理对象
	IStudentService proxy = (IStudentService)Proxy.newProxyInstance(classLoader,interfaces,new MyHandler(ser));
	proxy.show();
	//jdk动态代理
	System.out.println(proxy.getClass());
	
	
	
	
	
}//main end

}//class end


class MyHandler implements InvocationHandler{
    IStudentService ser;
	
    @Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("很多很多代码");
		System.out.println("很多很多代码");
		System.out.println("很多很多代码");
		
		//执行目标方法
		Object result = method.invoke(ser, args);
		
		System.out.println("一些代码");
		System.out.println("一些代码");
		
		return result;
	}
	
	
	
	
	
	public MyHandler(IStudentService ser) {
		super();
		this.ser = ser;
	}
}





































