package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//collect form data
		String name = request.getParameter("pname");
		String fathersName = request.getParameter("fname");
		
	
		
		//out.println("<form action=srv2 method=post>");
		out.println("<input type=hidden name=pname value="+name+">");
		out.println("<input type=hidden name=fname value="+fathersName+">");
		RequestDispatcher rd = request.getRequestDispatcher("form2.jsp");
		rd.include(request, response);
	}

}
