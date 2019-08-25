package com.pragim.springjdbcbasicopswithjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragim.springjdbcbasicopswithjavaconfig.config.SpringConfiguration;
import com.pragim.springjdbcbasicopswithjavaconfig.model.SpringJdbcBean;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		 AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				 SpringConfiguration.class);
		
		SpringJdbcBean beanObj = applicationContext.getBean("springJdbcBean",SpringJdbcBean.class);
		//beanObj.saveStudent();
		//beanObj.updateStudent();
		//beanObj.getStudentList();
		beanObj.fetchStudentDataUsingResultsetExtractor();

	}
}
