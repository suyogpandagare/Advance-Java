package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class S4 extends HttpServlet {
	
	HashMap<String, String> hm = new HashMap<String,String>();
	DAO dao = new DAO();
	
	public void init(ServletConfig config) throws ServletException {
		
		
		ResultSet rs = dao.getRows("select username,password from Users");
		
		try {
			while(rs.next()) {
				hm.put(rs.getString(1), rs.getString(2));
			}
			//System.out.println(hm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<form method='POST'>");
		pw.println("<br/>Enter UserName : <input type='text' name='uname' placeholder='User Name' />");
		pw.println("<br/>Enter Password : <input type='password' name='pwd' placeholder='Password' />");
		pw.println("<br/><input type='submit' value='login' />");
		pw.println("</form></body></html>");
		pw.close();
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if(hm.containsKey(uname)) {
			pw.println("<html><body>");
			pw.println("<h3>Welcome "+uname+" !!!</h3>");
			
		}else {
			pw.println("<h3>Invalid user !!!</h3>");
		}
		pw.println("</body></html>");
		pw.close();
		
	}

}
