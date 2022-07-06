package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver class from jar to RAM
		Class.forName("com.mysql.cj.jdbc.Driver"); //class Class ka object ban gia
		
		String url = "jdbc:mysql://localhost:3306/ietmarch22";
		String uname = "root";
		String pwd = "root";
		
		Connection con = DriverManager.getConnection(url,uname,pwd);
		
		Statement stmt = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter product");
		String name = sc.next();
		System.out.println("enter cost");
		int cost = sc.nextInt();
		
		/*int id = 2;
		String name = "hard disk";
		int cost = 500; */   
		
		String sql = "insert into product values("+id+",'"+name+"',"+cost+")";
		stmt.executeUpdate(sql);
		System.out.println("record inserted");
		
		//System.out.println(con);
	}
}
