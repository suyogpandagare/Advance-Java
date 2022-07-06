package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv2
 */
@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String c1 = request.getParameter("count");
		
		int c = (Integer)request.getAttribute("counter");  //getAttribute needs object so counter came here as autoboxing and we then did unboxing into integer this is like updacting then downcasting
		
		
		response.getWriter().append("Serv2 got counter as "+c).append("serv2 got the count as "+c1);

		ServletContext sc = super.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/Serv3");
		c++;
		request.setAttribute("counter", c);
		rd.include(request, response);
		//rd.forward(request, response);
		response.getWriter().append("returning from serv2");
}

}