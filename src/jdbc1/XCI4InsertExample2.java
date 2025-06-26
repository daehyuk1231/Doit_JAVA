package jdbc1;

import java.sql.*;
import java.util.*;

public class XCI4InsertExample2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String departmentsSQL = """
				SELECT
					department_id,
					department_name
				FROM
					departments
				""";
		String insertSQL = """
						INSERT INTO EMP_TEMP (LAST_NAME, SALARY, JOB_ID, COMMISSION_PCT, DEPARTMENT_ID)
						VALUES (?, ?, ?, ?, ?)
				""";

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

			Map<Integer, String> validDepartments = new LinkedHashMap<>();

			try (PreparedStatement deptStmt = conn.prepareStatement(departmentsSQL);
					ResultSet rs = deptStmt.executeQuery()) {
				System.out.println("부서 목록:");
				while (rs.next()) {
					int deptId = rs.getInt("department_id");
					String deptName = rs.getString("department_name");
					validDepartments.put(deptId, deptName);
					System.out.printf("%-5d\t%s%n", deptId, deptName);
				}
			}
			System.out.print("lastName: ");
			String lastName = sc.next();

			System.out.print("salary: ");
			int salary = sc.nextInt();

			System.out.print("jobId: ");
			String jobId = sc.next();

			System.out.print("commissionPct: ");
			int commissionPct = sc.nextInt();

			int deptId;
			while (true) {
				System.out.print("deptId: ");
				deptId = sc.nextInt();
				if (validDepartments.containsKey(deptId)) {
					break;
				} else {
					System.out.println("잘못된 부서번호");
				}
			}
			try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
				pstmt.setString(1, lastName);
				pstmt.setInt(2, salary);
				pstmt.setString(3, jobId);
				pstmt.setInt(4, commissionPct);
				pstmt.setInt(5, deptId);

				int rowsInserted = pstmt.executeUpdate();
				if (rowsInserted > 0) {
					System.out.println("입력O");
				} else {
					System.out.println("입력X");
				}
			}
		} catch (Exception e) {
			System.err.println("에러");
		}
	}
}