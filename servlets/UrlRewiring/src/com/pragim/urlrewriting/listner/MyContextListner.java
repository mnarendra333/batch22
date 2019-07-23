package com.pragim.urlrewriting.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListner implements ServletContextListener {

	long startTime;
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		startTime = System.currentTimeMillis();
		ServletContext servletContext = sce.getServletContext();
		servletContext.log("application context created "+startTime);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
		servletContext.log("application context desroyed at "+System.currentTimeMillis());
		servletContext.log("application is active from "+startTime+" to "+System.currentTimeMillis());
		
	}

}
