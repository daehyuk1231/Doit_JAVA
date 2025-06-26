package jdbc2;

public class UserService {
	private static final UserDAO userDAO = UserDAO.getInstance();
	private static UserService instance; // 자기 자신 참조

	private UserService() {
	}

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	public boolean signUp(User user) {
		try {
			userDAO.signUp(user);
			return true;
		} catch (Exception e) {
			System.out.println("$$$회원 가입 실패 : "+e.getMessage());
			return false;
		}
	}
}
