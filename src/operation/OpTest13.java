package operation;

import java.util.Scanner;

public class OpTest13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println(a > 0 ? "양수" :
						   a < 0 ? "음수" : "ZERO");
	}
}
