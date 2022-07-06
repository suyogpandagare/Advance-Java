package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie")
public class CookieExample extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String color = request.getParameter("fav-col");
	
	Cookie c = new Cookie("fav", color);
	response.addCookie(c);
	
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.println("<html><body bgcolor='"+color+"'> <form action='first'>");//first here means MyServlet
	pw.println("<input type='submit' value='ok' /> </form></body></html>");
	
	
	
	}

}
