package com.pragim.springfirstapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pragim.springfirstapp.beans.HelloWorldBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	//create resource object to point the dependent and dependencies
    	Resource resource = new ClassPathResource("spring.xml");
    	
    	//create spring container
    	BeanFactory factory = new XmlBeanFactory(resource);
    	HelloWorldBean bean = factory.getBean("id1",HelloWorldBean.class);
    	bean.showMessage();
    	
    }
}
