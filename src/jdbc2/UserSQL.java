package jdbc2;

public class UserSQL {
	public static final String INSERT_USER = """
			INSERT INTO XCI_MEMBERS (USERNAME, PASSWORD, NAME, EMAIL, BIRTH, JOIN_DATE)
			VALUES (?, ?, ?, ?, ?, SYSDATE)
			""";

	public static final String GET_USER = """
			SELECT USERNAME, PASSWORD, NAME, EMAIL, BIRTH
			FROM XCI_MEMBERS
			WHERE USERNAME = ? AND PASSWORD = ?
			""";
}
