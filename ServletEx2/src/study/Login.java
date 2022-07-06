package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		System.out.println(username+" "+password+" "+gender);
		String capitalCase = username.substring(0, 1).toUpperCase()+username.substring(1, username.length()).toLowerCase();
		String outputName="";
		if(gender.equals("male")) {
			outputName = "Mr. "+capitalCase;
		}else {
			outputName = "Madam. "+capitalCase;
		}
		if(username.equals("iet") && password.equals("123")) {
			pw.println("Welcome !!"+outputName);
		}else {
			pw.println("Incorrect Credentials");
		}
		pw.close();
	}

}
