/*2.  Write a Java client that fetches all names of the products
	add all the names in an ArrayList 
	show the size of the arrayList 
	Ask the user to enter a name
		print whether the name is in the ArrayList or not
*/

package study.hw;

import java.sql.ResultSet;

public class Client3 {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		//1=> add names in ArrayList
		ResultSet rs = dao.getRows("select name from product");
		dao.addNametoArrayList(rs);
		
		//2=> show size of the ArrayList
		dao.showArrayList();
		
		//3=> check product entered by user in ArrayList
		dao.checkProduct();
		
	
	}

}
