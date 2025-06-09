package operation;

import java.util.Scanner;

public class OpTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println((a%2==0) ? a + "은(는) 짝수입니다." :a + "은(는) 홀수입니다.");
	}
}
