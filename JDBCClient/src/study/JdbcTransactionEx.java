package study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTransactionEx {

	public static void main(String[] args) throws SQLException {

		DAO dao = new DAO();
		Connection con = dao.myGetConnection();
		PreparedStatement pstmt = con.prepareStatement("update account set balance=? where accNo=?");
		
		try {
		con.setAutoCommit(false);
		pstmt.setInt(1, 5000);
		pstmt.setString(2, "B");
		
		pstmt.executeUpdate();
		
		pstmt.setInt(3, 9000);  //we are giving wrong ? number so query fails and 1st query gets rollback
		pstmt.setString(2, "C");
		pstmt.executeUpdate();
		
		System.out.println("successeded...");
		
		con.commit();
		}catch(SQLException e) {
			System.out.println("failed...");
			con.rollback();
		}
		
		
		
		
		
	}

}
