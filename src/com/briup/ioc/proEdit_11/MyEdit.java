package com.briup.ioc.proEdit_11;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
// 当前类 就是自定义属性编辑器
public class MyEdit extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		//字符串信息 text = 昆山,学院路,中国
		Address address = new Address();
		String[] split = text.split(",");
		address.setCity(split[0]);
		address.setStreet(split[1]);
		address.setCountry(split[2]);
		
		//spring会调用getValue()获得 转换以后的对象
		setValue(address);
		
	}
	
	
}
