package study.hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//load the driver class from jar to RAM
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ietmarch22";
		String uname = "root";
		String pwd = "root";

		Connection conn = DriverManager.getConnection(url, uname, pwd);

		Statement st = conn.createStatement();

		ResultSet rs = null;
		int ch;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice : \n"
					+ "1. View All records \n"
					+ "2. Insert a record \n"
					+ "3. Update a record \n"
					+ "4. Delete a record \n"
					+ "5. Quit");

			ch = sc.nextInt();
			if (ch == 5) {
				System.out.println("Exiting from database");
				break;
			}


			switch(ch) {

			case 1: {
				
				//read query
			    String sql = "select * from product";
				rs = st.executeQuery(sql);
				while(rs.next()) {
					System.out.println("Product Id -> "+rs.getInt(1));
					System.out.println("Product Name -> "+rs.getString(2));
					System.out.println("Product Cost -> "+rs.getInt(3));
					System.out.println();
				}
				break;
			}

			case 2: {
				System.out.println("enter id");
				int id = sc.nextInt();
				System.out.println("enter product name");
				String name = sc.next();
				System.out.println("enter cost");
				int cost = sc.nextInt();

				String sql = "insert into product values("+id+",'"+name+"',"+cost+")";
				st.executeUpdate(sql);
				System.out.println("record inserted");
				break;
			}

			case 3: {
				System.out.println("enter id");
				int uid = sc.nextInt();
				System.out.println("enter product name");
				String newname = sc.next();
				System.out.println("enter cost");
				int newcost = sc.nextInt();

				String sql = "update product set name = '"+newname+"' , cost = "+newcost+" where id = "+uid+"";

				st.executeUpdate(sql);
				System.out.println("record updated");
				break;
			}

			case 4: {
				System.out.println("enter id");
				int uid = sc.nextInt();

				String sql = "delete from product where id = "+uid+"";
				st.executeUpdate(sql);
				System.out.println("record deleted");
				break;
			}



			}//switch end
		}while(ch != 5);//while end

		


	}//end of main

}//end of client class
