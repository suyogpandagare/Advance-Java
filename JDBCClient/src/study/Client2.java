package study;

import java.sql.ResultSet;

public class Client2 {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		/*ResultSet rs = dao.getRows("select * from product");
		dao.showResultSet(rs);*/
		
		//show all the records from the table that have cost less than 200
		
		/*ResultSet rs1 = dao.getRows("select * from product where cost < 200");
		dao.showResultSet(rs1);*/
		
		/*dao.addProduct(4, "network card", 1000);
		dao.showResultSet(dao.getRows("select * from product"));*/
		
		/*dao.updateCost(6, 499);
		dao.showResultSet(dao.getRows("select * from product"));*/
		
		//dao.callHiStoredProc();
		
		dao.callgetNameProc(5);
		
	}

}
