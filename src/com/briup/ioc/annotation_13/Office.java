package com.briup.ioc.annotation_13;

import org.springframework.stereotype.Component;

@Component
public class Office {
	
	private String num = "001";
	
	public Office(){
		
	}
	
	public Office(String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Office [num=" + num + "]";
	}

}
