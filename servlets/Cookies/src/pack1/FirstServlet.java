package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/srv1")
public class FirstServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		//get form data
		
		String personName = request.getParameter("pname");
		String fathersName = request.getParameter("fname");
		response.setContentType("text/html");
		
		//put the data into cookies
		
		Cookie c1 = new Cookie("perName", personName);
		Cookie c2 = new Cookie("fatrsName", fathersName);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		RequestDispatcher rd = request.getRequestDispatcher("form2.jsp");
		rd.include(request, response);
		
	}

}
