package jdbc2;

public class UserService {
	private static final UserDAO userDAO = UserDAO.getInstance();

	private static UserService instance;
	private UserService() {}
	
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
			System.out.println("$$$회원 가입 실패 : " + e.getMessage());
			return false;
		}
	}

	public User login(String username, String password) {
		try {
			return userDAO.getUser(username, password);
		} catch (Exception e) {
			System.out.println("$$$로그인 실패 : " + e.getMessage());
			return null;
		}
	}

	public void updatePassword(String username, String newPassword) throws Exception {
		try {
			if (newPassword.length() < 3) throw new RuntimeException(MessageUtil.get("error.user.password"));
			int result = userDAO.updatePassword(username, newPassword);
			if (result > 0) 	return;
			else throw new RuntimeException(MessageUtil.get("error.user.password2"));
		} catch (Exception e) {
			System.out.println("$$$패스워드 수정 실패 : " + e.getMessage());
			throw e;
		}
	}
}