package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InputServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>" );
		pw.println("<form action='second' method='get' >");
		pw.println("Enter a number: <input type='number' name='num' />");
		pw.println("<br/> Enter from-num: <input type='number' name='fromNum' />");
		pw.println("<br/> Enter range: <input type='number' name='range' />");
		pw.println("<br /><input type='submit' value='show table' />");
		pw.println("</form>");
		pw.println("</body></html>");
		pw.close();
		
		
		
	}

}
