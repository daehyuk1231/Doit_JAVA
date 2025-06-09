package operation;

public class OpTest3 {
	public static void main(String[] args) {
		boolean b1 = true, b2 = false;

		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);

		int n1 = 5, n2 = 3;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(~n1);

		n1 = n1 ^ n2;
		n2 = n2 ^ n1;
		n1 = n1 ^ n2;
		System.out.println(n1 + "," + n2);
	}
}
