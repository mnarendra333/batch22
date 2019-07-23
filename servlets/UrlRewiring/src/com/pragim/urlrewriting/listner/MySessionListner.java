package com.pragim.urlrewriting.listner;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListner
 *
 */
@WebListener
public class MySessionListner implements HttpSessionListener {

   
	long startTime;
	
    public MySessionListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	
    	
    	startTime = System.currentTimeMillis();
    	ServletContext serCtx = se.getSession().getServletContext();
    	serCtx.log("session created at "+startTime);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	ServletContext serCtx = se.getSession().getServletContext();
    	serCtx.log("session destoryed at "+System.currentTimeMillis());
    	serCtx.log("session time is "+(System.currentTimeMillis()-startTime));
    	
    	
    }
	
}
