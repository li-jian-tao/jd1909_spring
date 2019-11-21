package com.briup.aop.staticproxy_1;
//人
public class Person {
	private String name;
	//买 核心业务逻辑
	public void buy() {
		System.out.println(name+" 选 cpu i9 9900hk");
		System.out.println(name + "还价 买散片");
		System.out.println(name+" 选 gpu rtx 2080ti");
	}
	public Person(String name) {
		super();
		this.name = name;
	}
}
