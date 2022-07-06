package study.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AnotherServlet")
public class AnotherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		
		 if(session == null)
	       {
	    	   response.getWriter().append("CANNOT ACCESS WITHOUT LOGIN");
	    	   return;
	       }
	       else
	       {
	    	   response.setContentType("text/html");
	    		PrintWriter pw = response.getWriter();
	    	
	    		String school = request.getParameter("school");
	    		session.setAttribute("school", school);
	    		
	    		pw.println("<html><body>");
	    		pw.println("<a href='LogoutServlet'>logout</a>");
	    		pw.println("<form  action='YetAnotherServlet' method='post' >");
	    		pw.println("<br />Welcome "+session.getAttribute("uname"));
	    		pw.println("<br /> <input type='submit' value='YetAnotherPage' />");
	    		pw.println("</form>");
	    		pw.println("</body></html>");
	    		pw.close();
	    	
	       }
	
	}

	

}
