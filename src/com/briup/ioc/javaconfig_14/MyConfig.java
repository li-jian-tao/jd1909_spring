package com.briup.ioc.javaconfig_14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.briup.bean.Student;
import com.briup.bean.Teacher;

/**
 * javaConfig<br>
 *   以java代码的形式配置ioc容器<br>
 * 类名上需要添加@Configuration注解 
 * spring才会承认这个类是javaConfig 的配置类<br>
 * 
 * */
@Configuration
//读取这个基础包下的所有组件注解
@ComponentScan(basePackages = "com.briup.ioc.annotation_13")
@ComponentScan(basePackages = "com.briup.bean")

//@Import(value = {另一个配置类.class,另一个配置类.class})
//加载该配置文件的内容
@PropertySource("classpath:/db.properties")
public class MyConfig {
	@Value("${driver}")
	private String driver;
	
	//javaConfig 配置bean对象的方法
	/**
	 * @Bean 把当前方法的返回值 放到ioc容器中<br>
	 *       id为 方法名<Br>
	 * */
	@Bean(name = "mystu", 
		  initMethod = "init",destroyMethod = "end")
	public Student stu() {
		System.out.println("-------"+driver);
		
		Student stu = new Student();
		stu.setId(10);
		stu.setName("tom10");
		stu.setAge(20);
		return stu;
	}
	
	@Autowired
	private Student stu;
	
	//在@Bean方法的参数位置声明变量 spring会自动注入
	@Bean
	public Teacher tea(Student stu) {
		Teacher tea = new Teacher();
		tea.setId(20);
		tea.setName("tom");
		tea.setStudent(stu);
		return tea;
	}
	
	
	
}





