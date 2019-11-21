package com.briup.ioc.event_12;

import org.springframework.context.ApplicationListener;

//自定义监听器-->需要放到ioc容器中
public class MyListener 
		implements ApplicationListener<MyEvent>{
	
	//如果容器中 发布了MyEvent事件 就会执行下面代码
	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println("监听器 : "+event.getSource());
	}
	
}
