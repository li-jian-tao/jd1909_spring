package com.briup.ioc.annotation_13;

import org.springframework.stereotype.Component;

@Component
public class Car {
	

	private  String name;
	private double price;
	
	public Car(){
		
	}
	
	public Car(double price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
}
