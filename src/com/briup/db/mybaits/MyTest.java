package com.briup.db.mybaits;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.Book;
import com.briup.db.IBookDao;

public class MyTest {
	@Test
	public void my_batis() {
		try {
			String[] path = {"com/briup/db/mybaits/mybatis_spring.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
