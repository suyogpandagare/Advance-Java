package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTutorial {

	public static void main(String[] args) throws SQLException, IOException {

		Connection con = null;
		ResultSet rs = null;   //result store krne ke lie
		Statement stmt = null;
		PreparedStatement pstmt1 = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ietmarch22","root","root");
			
			if(con!=null) {
				System.out.println("Connection successful");
				stmt = con.createStatement();
				//read Query
				rs = stmt.executeQuery("Select * from product");
				
				while(rs.next()) {
					System.out.println("Product Id -> "+rs.getInt(1));
					System.out.println("Product Name -> "+rs.getString(2));
					System.out.println("Product Cost -> "+rs.getInt(3));
					System.out.println();
				}
				
				//update query
				pstmt1 = con.prepareStatement("update product set name=?,cost=? where id=?");
				System.out.println("Enter Id to modify");
				int r = Integer.parseInt(br.readLine());
				System.out.println("Enter name to modify");
				String name = br.readLine();
				System.out.println("Enter cost to modify");
				int c = Integer.parseInt(br.readLine());
				pstmt1.setInt(3, r);
				pstmt1.setString(1, name);
				pstmt1.setInt(2, c);
				System.out.println(pstmt1.executeUpdate());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//we must close all these objects due to RAM issues
			pstmt1.close();
			stmt.close();
			rs.close();
			con.close();
			br.close();
		}
		
		
	}

}
