package com.briup.aop.staticproxy_1;
//家人
public class Finally {
	private String name;
	//亲戚 要带 我 或者 你 去买电脑
	private Person target;
	
	public void buy() {
		System.out.println(name+"带wo走去电脑城");
		target.buy();
		System.out.println(name+"回家");
	}
	public Finally(String name, Person target) {
		super();
		this.name = name;
		this.target = target;
	}
}
