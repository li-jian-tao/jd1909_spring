package com.briup.ioc.event_12;

import org.springframework.context.ApplicationEvent;

//自定义事件
public class MyEvent extends ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
		System.out.println("自定义事件 : "+source);
	}
}
