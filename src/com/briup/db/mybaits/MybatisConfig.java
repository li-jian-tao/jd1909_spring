package com.briup.db.mybaits;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//是一个javaConfig的配置类
@Configuration
public class MybatisConfig {

	@Bean
	public DataSource ds() {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username="briup";
		String password="briup";
		DriverManagerDataSource ds = new DriverManagerDataSource(url, username, password);
		ds.setDriverClassName(driver);
		return ds;
	}
	
	@Bean
	public SqlSessionFactoryBean factory(DataSource ds) throws IOException {
		//设置数据源
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		//读取映射文件
		String mapperPath="classpath:/com/briup/db/mybaits/BookMapper.xml";//*代表所有Mapper.xml
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources(mapperPath);
		factory.setMapperLocations(resources);
		return factory;
	}
	
	@Bean
	public MapperScannerConfigurer scan() {
		MapperScannerConfigurer conf = new MapperScannerConfigurer();
		conf.setSqlSessionFactoryBeanName("factory");
		//指定映射接口所在包
		conf.setBasePackage("com.briup.db");
		return conf;
	}
}










