package com.briup.ioc.annotation_13;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component("bo")

public class Boss {
	private  String name;
	
	//@Autowired(required = false)
	//@Qualifier("cd")
	@Resource
	private Car car;
	
	private Office office;
	
	@Autowired
	public void setOffice(Office office) {
		this.office = office;
	}
	//@Autowired
	public Boss(Car car, Office office) {
		this.car = car;
		this.office = office;
	}
	
	
	

	public Boss() {

	}

	public Boss(String name, Car car, Office office) {
		this.name = name;
		this.car = car;
		this.office = office;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Office getOffice() {
		return office;
	}

	//初始化执行该方法
	@PostConstruct
	public void init() {
		System.out.println("初始化..");
	}
	//销毁 执行该方法
	@PreDestroy
	public void destroy() {
		System.out.println("..销毁...");
	}
	
	@Override
	public String toString() {
		return "Boss [name=" + name + ", car=" + car + ", office=" + office + "]";
	}
}
