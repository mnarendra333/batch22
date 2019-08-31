package com.pragim.shoppingcartappusingspringrest.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		// <some context configuration>

		ServletRegistration.Dynamic spring = container.addServlet("Spring", new DispatcherServlet(context));
		// <some servlet configuration>

		// Here, set desired context class using 'contextClass' parameter.
		spring.setInitParameter("contextClass", context.getClass().getName());

		//container.addListener(new ContextLoaderListener(context));
	}
}
