package study.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/YetAnotherServlet")
public class YetAnotherServlet extends HttpServlet {

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

			pw.println("<html><body>");
			pw.println("<a href='LogoutServlet'>logout</a>");
			pw.println("<form  action='YetAnotherServlet' method='post' >");
			pw.println("<br />Welcome "+session.getAttribute("uname"));
			pw.println("<br />School "+session.getAttribute("school"));

			pw.println("</form>");
			pw.println("</body></html>");
			pw.close();

		}
	}

}



