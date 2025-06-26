package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	private static UserDAO instance; // 자기 자신 참조

	private UserDAO() {
	}

	public static UserDAO getInstance() {
		if (instance == null) {
			instance = new UserDAO();
		}
		return instance;
	}

	public void signUp(User user) throws SQLException {
		String insertSQL = """
					INSERT INTO XCI_MEMBERS (USERNAME, PASSWORD, NAME, EMAIL, BIRTH, JOIN_DATE)
					VALUES (?, ?, ?, ?, ?, SYSDATE)
				""";

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.setInt(5, user.getBirthYear());

			pstmt.executeUpdate();
		}
	}
}
