package control;

import java.util.Iterator;

public class WhileTest1 {
	public static void main(String[] args) {
		/*
		 * for (int n = 1; n <= 3; n++) { System.out.println(n * 10 + ":sysone"); }
		 */
		int n = 3, sum = 0;

		while (n <= 1000) {
			sum += n;
			n+=3;
		}
		System.out.println(sum);

		System.out.println("종료");
	}
}
