package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignIn")
public class SignIn extends HttpServlet {

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		DbConnMgr con=new DbConnMgr();
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		boolean  b=con.SignIn(username,password);
		
		System.out.println(username+" "+password);
		if(b) {
			
			out.println("Welcome...!");
		}
		else {
			out.println("Invalid user");
		}
		
		
	}

}
