package control;

import java.util.Iterator;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println("1부터 1000까지 3의 배수의 합계는 " + sum);
		System.out.println("종료");
	}
}
