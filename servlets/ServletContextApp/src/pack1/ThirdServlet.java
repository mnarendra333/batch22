package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		
		ServletConfig ctx = getServletConfig();
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
