package study.hw;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {

		
		DAO dao  = new DAO();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			
		System.out.println("Enter your choice \n"
				+ "1. Update name of given id \n"
				+ "2. Update cost of given id \n"
				+ "3. Update Both Name and Cost of given id \n"
				+ "4. Delete a record of given id \n"
				+ "5. Show Only the info of given id \n"
				+ "6. Quit");
		
		choice = sc.nextInt();
		
		if(choice == 6) {
			System.out.println("Exiting from database Thank you...");
			break;
		}
		
		switch(choice) {
		
		case 1: {
			dao.getConnection();
			System.out.println("Enter id and name to update using id");
			int id = sc.nextInt();
			String name = sc.next();
			dao.updateName(id, name);
			System.out.println("Name updated successfully..");
			break;
		}
		
		case 2: {
			dao.getConnection();
			System.out.println("Enter id and cost to update using id");
			
			int id = sc.nextInt();
			int cost = sc.nextInt();
			
			dao.updateCost(id, cost);
			System.out.println("Cost updated successfully..");
			break;
		}
		
		case 3: {
			dao.getConnection();
			System.out.println("Enter id,cost and name to update using id");
			
			int id = sc.nextInt();
			int cost = sc.nextInt();
			String name = sc.next();
			
			dao.updateNameandCost(id, cost, name);
			System.out.println("Name and Cost updated successfully..");
			break;
		}
		
		case 4: {
			dao.getConnection();
			System.out.println("Enter id to delete a record");
			
			int id = sc.nextInt();
			
			dao.deleteRecord(id);
			System.out.println("Record Deleted successfully..");
			break;
		}
		
		case 5: {
			dao.getConnection();
			System.out.println("Enter id to see that record only");
			
			int id = sc.nextInt();
			
			dao.getRowInfo(id);
			break;
		}
		
		}//switch end
		
		
		}while(choice != 6);
		//dao.updateName(5, "Chocolate");
		
		//dao.updateCost(5, 20);
		
		//dao.updateNameandCost(5, 30, "Biscuit");
		
		//dao.deleteRecord(6);
		
		//dao.getRowInfo(3);
		
	}//end of main

}//end of class DAO
