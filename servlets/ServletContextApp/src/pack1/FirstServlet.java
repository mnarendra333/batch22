package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("from init method");
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		ServletContext ctx = getServletContext();
		String className = ctx.getInitParameter("driverClassName");
		String url = ctx.getInitParameter("url");
		String uname = ctx.getInitParameter("username");
		String pwd = ctx.getInitParameter("password");
		
		out.println("className is "+className);
		out.println("url is "+url);
		out.println("uname is "+uname);
		out.println("pwd is "+pwd);
		
	}

}
