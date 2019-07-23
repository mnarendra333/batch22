package com.pragim.urlrewriting.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyReqListner
 *
 */
@WebListener
public class MyReqListner implements ServletRequestListener {

	long startTime,endTime;
	
	
    public MyReqListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	
 
    	ServletContext servletContext = sre.getServletContext();
    	servletContext.log("mean time for request processing is  "+(System.currentTimeMillis()-startTime));
   
    	
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	
    	startTime = System.currentTimeMillis();
    	
    	ServletContext servletContext = sre.getServletContext();
    	servletContext.log("request object created at "+startTime);
    }
	
}
