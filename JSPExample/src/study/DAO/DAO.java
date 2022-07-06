package study.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DAO {

	public Connection myGetConnection()
	{
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 

		String url = "jdbc:mysql://localhost:3306/ietmarch22";
		String uname = "root";
		String pwd = "root";

		con = DriverManager.getConnection(url,uname,pwd);
		}catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("the connection could not be made");
		}
		return con;

	}

	public ResultSet getRows(String sql){

		Connection con = myGetConnection();
		Statement stmt;
		ResultSet rs=null;
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return rs;
	}

	public void showResultSet(ResultSet rs)
	{
		try {
			while(rs.next())
			{
				int pId = rs.getInt("Id");
				String pName = rs.getString("name");
				int cost = rs.getInt(3);
				
				System.out.println("row : "+pId+", "+pName+", "+cost);
				
				
			}
		} catch (SQLException e) {
			System.out.println("problem showing resultset "+e);
		}
	}
	
	public void addProduct(int id, String name,int cost)
	{
		//get connection then get prepared statement
		Connection con = myGetConnection();
		try {
		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
				pstmt.setInt(1, id);
				pstmt.setString(2, name); //internally single quote added or not if null
				pstmt.setInt(3, cost);
				
				pstmt.executeUpdate();
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateCost(int id, int cost)
	{
		//get connection then get prepared statement
		Connection con = myGetConnection();
		try {
		PreparedStatement pstmt = con.prepareStatement("update product set cost=? where id=?");
				pstmt.setInt(2, id);
				pstmt.setInt(1, cost);
				
				pstmt.executeUpdate();
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void callHiStoredProc()
	{
		Connection con = myGetConnection();
		try {
			CallableStatement cstmt = con.prepareCall("call hi()");
			ResultSet rs = cstmt.executeQuery();
			rs.next();
			String msg = rs.getString("message");
			System.out.println("you got "+msg);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void callgetNameProc(int id)
	{
		Connection con = myGetConnection();
		try {
			CallableStatement cstmt = con.prepareCall("{ call getName(?,?) }");
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setInt(1, id);
			
			cstmt.execute();
			
			String msg = cstmt.getString(2);
			System.out.println("you got "+msg);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteUser(int id)
	{
		Connection con = myGetConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement("delete from product where id=?");
		
			pst.setInt(1, id);
			
			pst.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}//end of DAO
