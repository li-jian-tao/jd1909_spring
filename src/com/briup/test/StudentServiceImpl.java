package com.briup.test;

public class StudentServiceImpl implements IStudentService{
	@Override
	public void show(String name) {
		String method = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("执行业务逻辑"+method);
	}

	@Override
	public void myow() {
		String method = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("执行业务逻辑"+method);		
	}

}
