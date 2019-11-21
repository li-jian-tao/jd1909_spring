package com.briup.aop.service.impl;

import org.springframework.stereotype.Service;

import com.briup.aop.service.IAccountService;

/**
 * 目标类 ： 目标对象(target)
 * @Component
 * 		三层架构 
 * @Controller
 * @Service
 * @Repository
 * */
@Service("t1")
public class AccountServiceImpl implements IAccountService {

	// 转账
	//记录时间 地点 人物
	public void bankAction() {
		System.out.println("进行取款操作 withdraw!");
		System.out.println("进行存款操作 deposit!");
		throw new NullPointerException();
	}
	//记录 本次操作 时间
	@Override
	public void show() {
		System.out.println("....show....");
	}
	
	
	
	
	public AccountServiceImpl() {
		super();
	}

	
	

}
