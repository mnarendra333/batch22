package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		ServletConfig config = getServletConfig();
		String driverName = config.getInitParameter("driverClassName");
		String url = config.getInitParameter("url");
		String uname = config.getInitParameter("username");
		String pwd = config.getInitParameter("password");
		
		
		PrintWriter out = response.getWriter();
		out.println("driverClassName "+driverName);
		out.println("url "+url);
		out.println("uname "+uname);
		out.println("pwd "+pwd);
	}

}
