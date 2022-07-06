package study;

public class MySqlClient {

	public static void main(String[] args) {

		DAO dao = new DAO();
		dao.insertValues("rakhi", "rakhi123", "2000/03/17");
		dao.insertValues("sanket", "sanket123", "1998/03/23");
		dao.insertValues("abhi", "abhi123", "1998/04/17");
		dao.insertValues("himu", "himu123", "1998/05/11");
		dao.insertValues("aniket", "aniket123", "1998/05/27");
		System.out.println("added successfully");
	}

}
