package com.briup.db.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceUtils;

public class TestJDBC {
public static void main(String[] args) throws Exception {
	String path = "com/briup/db/jdbc/jdbc.xml";
	
	ClassPathXmlApplicationContext ioc =
		new ClassPathXmlApplicationContext(path);
	
	DataSource ds = (DataSource) ioc.getBean("dataSource3");
	
	//使用数据源获得连接对象
	Connection conn = ds.getConnection();
	//获得连接对象方法2
	Connection conn2 =
	    DataSourceUtils.getConnection(ds);
	
	
	//设置手动提交
	conn.setAutoCommit(false);
	
	Statement stat = conn.createStatement();
	//...jdbc操作
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
