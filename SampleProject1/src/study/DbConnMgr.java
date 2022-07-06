package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


public class DbConnMgr {

	HashMap<String, String> hm = new HashMap<>();
	
	public Connection myGetConnection()
	{
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 

		String url = "jdbc:mysql://localhost:3306/project1";
		String uname = "root";
		String pwd = "root";

		con = DriverManager.getConnection(url,uname,pwd);
		}catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("the connection could not be made");
		}
		return con;

	}
	
	
	public boolean SignUp(String name,String gen,String contactNo,String uname, String pwd)
	{
		//get connection then get prepared statement
		Connection con = myGetConnection();
		try {
			
		PreparedStatement pstmt = con.prepareStatement("insert into userInfoTbl values(?,?,?,?,?)");
		
				pstmt.setString(1, name);
				pstmt.setString(2, gen);
				pstmt.setString(3, contactNo);
		        pstmt.setString(4, uname);
				pstmt.setString(5, pwd); 
				
				pstmt.executeUpdate();
				return true;
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean SignIn(String uname,String pwd)
	{
		Connection con = myGetConnection();
		
		
		ResultSet rs = null;
		boolean flag=false;
		
		try {
			Statement st=con.createStatement();
			rs = st.executeQuery("select * from userInfoTbl");
		
			while(rs.next()) {
				
				//System.out.println(rs.getString(4)+rs.getString(5));
				if(uname.equals(rs.getString(4))) {
					if((pwd.equals(rs.getString(5)))){
						flag = true;
						break;
					}
				}
					
					
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
		
	}
	
	public boolean deleteUser(String uname,String pwd)
	{
		Connection con = myGetConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement("delete from userInfoTbl where uname=? and pwd=?");
		
			pst.setString(1, uname);
			pst.setString(2, pwd);
			
			pst.executeUpdate();
			
			return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	
}

















