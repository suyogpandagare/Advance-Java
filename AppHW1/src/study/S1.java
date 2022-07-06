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


@WebServlet("/find")
public class S1 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		DAO dao = new DAO();
		ResultSet rs = dao.getRows("select id from product");

		pw.println("<html><body>");
		pw.println("<form method='POST'>");
		int id=0;
		try {
			pw.println("<select name='product'>");
			while(rs.next()){
				id = rs.getInt(1);
				pw.println("<option value="+id+">"+id+"</option>");
			}
			pw.println("</select>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<br/><input type='submit' value='show details'/>");
		pw.println("</form></body></html>");
		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pid = request.getParameter("pid");
		DAO dao = new DAO();
		ResultSet rs = dao.getRows("select * from product where id="+pid);

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<table><tr>"
				+ "");
		
		int pID,pCost;
		String pName;
		
		try {
		while(rs.next()) {
			pID = rs.getInt(1);
			pName = rs.getString(2);
			pCost = rs.getInt(3);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		pw.println("<form action='update' method='POST'>");
		pw.println("<br />PID='pid'");
		pw.println("<br />Product-Name='pName'");
		pw.println("<br />Cost='pCost'");
		
		pw.println("Product ID:<input type='text' name='pid' value='"+pID+"'readonly />");
		pw.println("<br />Product Name:<input type='text' name='pname' value='"+pName+"' />");
		pw.println("<br />Product Cost:<input type='text' name='pcost' value='"+pCost+"' />");
		pw.println("<br/><input type='submit' value='update' />");
		
		pw.println("</form></body></html>");
		pw.close();
		

	}







}










