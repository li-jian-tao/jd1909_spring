package com.briup.aop.aspect_切面类;

import org.springframework.stereotype.Component;

/**
 * 这个一个切面类<br>
 * 切面类中的方法是需要织入到切入点前/后/环绕 执行的
 * 
 * */
@Component("as")
public class MyAspect {
	//本方法是 前置通知中的代码提取出来的
	public void start() {
		System.out.println("...开始执行...");
		System.out.println("...开始执行...");
		System.out.println("...开始执行...");
	}
	
	
	
	
	
	public void log(String msg){
		System.out.println(" 切面类中日志方法   log   --   : "+msg);
	}
	public void log(){
		System.out.println(" 切面类中日志方法  无参  log   ");
	}
	
	public void commit(){
		System.out.println("----提交事务----");
	}
	
	public void hg(){
		System.out.println("---事务回滚---");
	}
	
}
