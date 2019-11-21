package com.briup.aop.pojo;

import org.springframework.stereotype.Component;

/**
 * 银行账户<br>
 * */
public class Account {
	private int id;
	private String name;
	private double balance;//余额
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
