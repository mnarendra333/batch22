package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/srv1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String parameter = request.getParameter("number");
		int no = Integer.parseInt(parameter);
		
		int square = no*no;
		
		out.println("square value is "+square);
		
		//do dispatch from srv1 to srv2
		
		response.sendRedirect("http://localhost:7777/App2/srv2?key1="+parameter+"&&key2="+square);
		//response.sendRedirect("http://www.twitter.com");
	}

}
