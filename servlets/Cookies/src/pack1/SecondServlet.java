package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/srv2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String income = request.getParameter("income");
		String tax = request.getParameter("tax");
		
		PrintWriter out = response.getWriter();
		
		out.println("income is "+income);
		out.println("tax is "+tax);
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				out.println(cookie.getName()+" is "+cookie.getValue());
			}
		}
		
	}

}
