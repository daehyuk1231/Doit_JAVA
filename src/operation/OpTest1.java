package operation;

import java.util.*;

public class OpTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / (double) b));
		System.out.println(a + "%" + b + "=" + (a % b));
		sc.close();
		System.out.println("종료");
	}
}
