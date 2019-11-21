package com.briup.db;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 基础pojo类：书
 * */
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private  String name;
	private  Double price;
	public Book(){
		
	}
	

	public Book(Long id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Book(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
