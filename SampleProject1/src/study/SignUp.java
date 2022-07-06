package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Name=request.getParameter("Name");
		String gender=request.getParameter("gender");
		String contact=request.getParameter("contact");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		DbConnMgr dbcon=new DbConnMgr();
		boolean b=dbcon.SignUp(Name,gender,contact,username,password);
		if(b) {
			out.println("Signup Successfull..!");
		}
		
		
		
		
		
	}

}
