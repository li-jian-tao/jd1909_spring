package com.briup.aop.staticproxy_1;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		Person wo = new Person("我");
		
		Person you = new Person("你");
		
		Finally f = new Finally("大哥", wo);
		
		f.buy();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
