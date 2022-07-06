package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//we are setting the http response header content type property
		response.setContentType("text/html");
		
		//we are connecting the PrintWriter to the RESPONSE body
		PrintWriter pw = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		String color=" ";
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("fav")) {
				color = cookie.getValue();
			}
		}
		//whatever we print here goes to http response body
		pw.println("<html><body bgcolor = '"+color+"'>");
		pw.println("<h1>HTML generated from servlet</h1>");
		pw.println("</body></html>");
		
		pw.close();
		
		
		
	}

}
