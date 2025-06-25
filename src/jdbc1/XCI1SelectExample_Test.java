package jdbc1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class XCI1SelectExample_Test {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args) {
		String selectSQL = """
				SELECT
				    이름 AS name,
				    국어 AS kor,
				    영어 AS eng,
				    수학 AS math,
				    철학 AS phil
				FROM
				    SCORE
				    """;
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(selectSQL)) { // 1. execute(), 2. executeQuery(), 3. executeUpdate()
			System.out.printf("%-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s%n", "이름", "국어", "영어", "수학", "철학", "총점", "평균");
			System.out.println("-------+--------+--------+--------+-------+--------+-------");
			while (rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				int phil = rs.getInt("phil");
				
				int total = kor + eng + math + phil;
				double avg = total / 4.0;
//				System.out.println("이름: " + name + ", 국어: " + kor + ", 영어: " + eng + ", 수학: " + math + ", 철학: " + phil);
				System.out.printf("%-5s | %-6d | %-5d | %-6d | %-6d | %-6d | %-5.0f%n", 
						name, kor, eng, math, phil, total, avg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}