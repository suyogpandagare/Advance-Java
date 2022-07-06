package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("num");
		int n = Integer.parseInt(num);
		
		String from = request.getParameter("fromNum");
		int f = Integer.parseInt(from);
		
		String range = request.getParameter("range");
		int r = Integer.parseInt(range);
		
		
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		for (int i = f; i <= r; i++) {
			
			String s = n+"*"+i+"="+n*i;
			//System.out.println(s);
			
			pw.println("<br />"+s);
			
		}
		pw.println("</body></html>");
		pw.close();
		
		
	}

}
