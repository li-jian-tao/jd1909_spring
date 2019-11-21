package com.briup.ioc.staticFactory_10;

import java.sql.Connection;
import java.sql.DriverManager;

public class StaticFactory {
	public static Connection geth() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection connection = 
			DriverManager.getConnection(url,"briup","briup");
		return connection;
	}
}
