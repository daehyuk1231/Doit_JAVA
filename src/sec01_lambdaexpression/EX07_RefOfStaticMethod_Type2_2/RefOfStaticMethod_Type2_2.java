package sec01_lambdaexpression.EX07_RefOfStaticMethod_Type2_2;

interface A {
	String abc(String str);
}

public class RefOfStaticMethod_Type2_2 {
	public static void main(String[] args) {

		A a1 = new A() {
			@Override
			public String abc(String str) {
				return str.toLowerCase();
			}
		};

		A a2 = (String str) -> str.toLowerCase();

		A a3 = String::toUpperCase;
		System.out.println(a1.abc("HELLO"));
		System.out.println(a2.abc("HELLO"));
		System.out.println(a3.abc("hello"));
	}
}
