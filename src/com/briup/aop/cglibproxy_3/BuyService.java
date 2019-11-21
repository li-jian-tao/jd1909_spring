package com.briup.aop.cglibproxy_3;

import org.springframework.stereotype.Service;

@Service("t2")
public class BuyService {

	public void buy() {
		System.out.println("买东西");
	}
	
}
