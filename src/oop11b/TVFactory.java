package oop11b;

// Simple factory pattern
public class TVFactory {
	public static TV getTV() {
		String tvClassName = null;
		try {
			tvClassName = ProductReader.getValue("tv");
			return (TV) Class.forName(tvClassName).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			System.out.println(tvClassName + " 클래스가 존재하지 않거나 에러입니다.");
			return null;
		}
	}
}
