package com.briup.ioc.factory_8;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

//获得连接对象的工厂
public class ConnFactory 
		implements FactoryBean<Connection>{
	
	//工厂产生对象的方法
	@Override
	public Connection getObject() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection connection = 
			DriverManager.getConnection(url,"briup","briup");
		return connection;
	}
	//返回工厂产生对象的类型
	@Override
	public Class<?> getObjectType() {
		return Connection.class;
	}
	//是否单例
	@Override
	public boolean isSingleton() {
		return true;
	}
}
