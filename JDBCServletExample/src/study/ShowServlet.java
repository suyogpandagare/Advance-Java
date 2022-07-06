package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//we use web servlet annotation insted of web.xml
@WebServlet("/show")
public class ShowServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAO dao = new DAO();
		ResultSet rs = dao.getRows("select * from product");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<table border='2'>");
		try {
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int cost = rs.getInt(3);
				pw.println("<tr><td>"+id+"</td><td>"+name+"</td><td>"+cost+"</td></tr>");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("</table></body></html>");
		
	}

	

}
