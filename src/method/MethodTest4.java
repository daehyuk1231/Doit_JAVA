package method;

public class MethodTest4 {
	public static void main(String[] args) {
		prn(1);
		prn(2, 3);
		prn(3, 4, 5);
	}

	private static void prn(int... n) {
		for(int i:n) {
			System.out.print(1+"\t");
		}
		System.out.println();
	}
}