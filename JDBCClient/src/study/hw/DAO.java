/*1. Write a Java client that gives following Menu
	Do it using study.hw.DAO + PrepareStatement 
	Write main class as study.hw.Client3

	1. update name of a given id
	2. update cost of given id
	3. update both name and cost of given id
	4. delete a record of given
	5. show only the info of row of given id
	6. quit*/


package study.hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DAO {

	ArrayList<String> al = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	public Connection getConnection()
	{
	Connection con = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ietmarch22","root","root");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	return con;
	}
	
	public void updateName(int id,String name)
	{
		Connection con = getConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement("update product set name=? where id=? ");
		
			pst.setString(1, name);
			pst.setInt(2, id);
			
			pst.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateCost(int id,int cost)
	{
		Connection con = getConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement("update product set cost=? where id=?");
		
			pst.setInt(1, cost);
			pst.setInt(2, id);

			pst.executeUpdate();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void updateNameandCost(int id,int cost,String name)
	{
		Connection con = getConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement("update product set name=?,cost=? where id=?");
		
			pst.setString(1, name);
			pst.setInt(2, cost);
			pst.setInt(3, id);

			pst.executeUpdate();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteRecord(int id)
	{
		Connection con = getConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement("delete from product where id=?");
		
			pst.setInt(1, id);
			
			pst.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void getRowInfo(int id)
	{
		Connection con = getConnection();
		
		PreparedStatement pst;
		ResultSet rs = null;
		
		try {
			pst = con.prepareStatement("select * from product where id=?");
			pst.setInt(1, id);
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				int pId = rs.getInt(1);
				String pName = rs.getString(2);
				int pCost = rs.getInt(3);
				
				System.out.println("The row info is = "+"ProductID = " +pId+", "+"ProductName = "+pName+", "+"ProductCost = "+pCost);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public ResultSet getRows(String sql)
	{
		Connection con = getConnection();
		ResultSet rs = null;
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public void addNametoArrayList(ResultSet rs)
	{
		try {
			while(rs.next()) {
				String pName = rs.getString(1);
				al.add(pName.toLowerCase());
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void showArrayList()
	{
		System.out.println("Size of ArrayList = "+al.size());
		System.out.println(al);
	}
	
	public void checkProduct()
	{
		while(true)
		{
			System.out.println("Enter product name to cheeck");
			String pName = sc.next().toLowerCase();
			if(al.contains(pName))
			{
				System.out.println(pName+" is present in ArrayList");
			}
			else
				System.out.println(pName+"not present in ArrayList");
		}
	}
	
	
	
	
	
}//end of class
