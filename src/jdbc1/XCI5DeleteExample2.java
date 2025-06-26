package jdbc1;

import java.sql.*;
import java.util.Scanner;

public class XCI5DeleteExample2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String deleteSQL = "DELETE EMP_TEMP WHERE LAST_NAME = ?";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
			System.out.println("삭제 LastName:");
			String lastName = sc.next();
			pstmt.setString(1, lastName);
			int rowsDeleted = pstmt.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("삭제 되었습니다!");
			} else {
				System.out.println("삭제된 행이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}