package com.briup.db.mybaits;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.briup.db.Book;
import com.briup.db.IBookDao;

public class MyBatisTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//使用javaConfig的配置类创建ioc容器
		AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MybatisConfig.class);
		//打印所有ioc容器的beanname
		String[] names = ioc.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		IBookDao dao = (IBookDao) ioc.getBean("IBookDao");
		List<Book> list = dao.findBook();
		System.out.println(list);
	}
	
}
