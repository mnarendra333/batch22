package com.pragim.springjdbcbasicops;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragim.springjdbcbasicops.model.SpringJdbcBean;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	
		SpringJdbcBean beanObj = ctx.getBean("springJdbcBean",SpringJdbcBean.class);
		//beanObj.saveStudent();
		//beanObj.updateStudent();
		//beanObj.getStudentList();
		beanObj.fetchStudentDataUsingResultsetExtractor();

	}
}
