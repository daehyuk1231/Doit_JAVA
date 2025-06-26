package jdbc2;

import java.sql.*;
import java.util.Scanner;
import lombok.Data;

public class MembershipManagement {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	private static Scanner sc = new Scanner(System.in);
	private static User loggedInUser = null;

	private static final UserService userService = UserService.getInstance();

	public static void main(String[] args) {
		while (true) {
			System.out.println("----------------");
			System.out.println("0. 회원 가입");
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			System.out.println("----------------");
			System.out.print("입력 > ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 0 -> signUp();
			case 1 -> {
				if (login())
					afterLoginMenu();
			}
			case 2 -> System.out.println("프로그램을 종료합니다.");
			default -> System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void signUp() {
		System.out.print("id: ");
		String username = sc.nextLine();
		System.out.print("pw: ");
		String password = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("이메일: ");
		String email = sc.nextLine();
		System.out.print("생년: ");
		int birthYear;

		System.out.println("생년: ");
		birthYear = getNumberInput();

		User user = new User(username, password, name, email, birthYear);

		if (userService.signUp(user)) {
			System.out.println("회원가입 성공.");
		} else {
			System.out.println("회원가입 실패.");
		}
	}

	private static int getNumberInput() {
		do {
			System.out.print("> ");
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}
		} while (true);
	}

	private static boolean login() {
		int attempts = 0;
		while (attempts < 3) {
			System.out.print("id: ");
			String username = sc.nextLine();
			System.out.print("pw: ");
			String password = sc.nextLine();

			loggedInUser = userService.login(username, password);
			if (loggedInUser != null) {
				System.out.println("로그인 성공: " + loggedInUser.getName());

			} else {
				System.out.println("아이디 혹은 패스워드가 틀립니다.");
				attempts++;
			}

		}
		System.out.println("접속을 종료합니다.");
		return false;
	}

	private static void afterLoginMenu() {
		while (true) {
			System.out.println("----------------");
			System.out.println("0. 자기정보보기 및 수정");
			System.out.println("1. 회원 탈퇴");
			System.out.println("2. 회원 검색");
			System.out.println("3. 로그아웃");
			System.out.println("----------------");
			System.out.print("입력 > ");
			int choice = getNumberInput();
			switch (choice) {
			case 0 -> viewAndUpdateProfile();
			case 1 -> {
				deleteUser();
				loggedInUser = null;
				return;
			}
			case 2 -> searchUser();
			case 3 -> {
				loggedInUser = null;
				return;
			}
			default -> System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void viewAndUpdateProfile() {
		System.out.println("아이디: " + loggedInUser.getUsername());
		System.out.println("이름: " + loggedInUser.getName());
		System.out.println("이메일: " + loggedInUser.getEmail());
		System.out.println("생년: " + loggedInUser.getBirthYear());
		System.out.println("비밀번호를 변경하시겠습니까? (y/n)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			System.out.print("새 비밀번호: ");
			String newPassword = sc.nextLine();
			String updateSQL = "UPDATE XCI_MEMBERS SET PASSWORD = ? WHERE USERNAME = ?";
			try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
					PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
				pstmt.setString(1, newPassword);
				pstmt.setString(2, loggedInUser.getUsername());
				int rowsUpdated = pstmt.executeUpdate();
				if (rowsUpdated > 0) {
					loggedInUser.setPassword(newPassword);
					System.out.println("비밀번호가 변경되었습니다.");
				} else {
					System.out.println("비밀번호 변경 실패.");
				}
			} catch (SQLException e) {
				System.out.println("비밀번호 변경 중 오류가 발생했습니다: " + e.getMessage());
			}
		}
	}

	private static void deleteUser() {
		System.out.print("정말로 탈퇴하시겠습니까? (y/n) ");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			String deleteSQL = "DELETE FROM XCI_MEMBERS WHERE USERNAME = ?";
			try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
					PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
				pstmt.setString(1, loggedInUser.getUsername());
				int rowsDeleted = pstmt.executeUpdate();
				if (rowsDeleted > 0) {
					System.out.println("회원 탈퇴가 완료되었습니다.");
					loggedInUser = null;
				} else {
					System.out.println("회원 탈퇴 실패.");
				}
			} catch (SQLException e) {
				System.out.println("회원 탈퇴 중 오류가 발생했습니다: " + e.getMessage());
			}
		}
	}

	private static void searchUser() {
		System.out.print("검색할 아이디: ");
		String username = sc.nextLine();
		String searchSQL = "SELECT USERNAME, NAME, EMAIL, BIRTH FROM XCI_MEMBERS WHERE USERNAME = ?";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(searchSQL)) {
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("아이디: " + rs.getString("USERNAME"));
				System.out.println("이름: " + rs.getString("NAME"));
				System.out.println("이메일: " + rs.getString("EMAIL"));
				System.out.println("생년: " + rs.getInt("BIRTH"));
			} else {
				System.out.println("해당 사용자를 찾을 수 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("사용자 검색 중 오류가 발생했습니다: " + e.getMessage());
		}
	}
}