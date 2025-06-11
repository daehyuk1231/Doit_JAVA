package stringclass;

public class StringTest1 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		String str = new String("문자열");

		String str2 = "";
		for (int i = 1; i <= 3; i++) {
			str2 += "ABC";
		}
		System.out.println(str2);
	}
}
