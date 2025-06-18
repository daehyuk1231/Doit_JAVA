package exception;

import java.util.Random;
import java.util.Scanner;

public class ExceptionTest5 {
	public static void main(String[] args) {
//		int n = (int) (Math.random() * 99) + 1;
		Random random = new Random();
		int n = random.nextInt(99) + 1;
		int you = 0;
		int count = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("1부터 99사이의 정수를 입력하세요 > ");
				if (!sc.hasNextInt()) {
					System.out.println("값이 잘못 입력되었습니다.");
					sc.nextLine();
					continue;
				}
				you = sc.nextInt();
				sc.nextLine();
				if (!(1 <= you && you <= 99)) {
					System.out.println("값의 범위가 틀렸습니다. 1<= x <= 99사이의 정수로 입력하세요.");
					count++;
				} else if (you != n && you > n) {
					System.out.println("입력 값은 " + you + "입니다. 컴퓨터가 생각하던 값보다 큽니다.");
					count++;
				} else if (you != n && you < n) {
					System.out.println("입력 값은 " + you + "입니다. 컴퓨터가 생각하던 값보다 작습니다.");
					count++;
				} else {
					System.out.println("맞았습니다. 컴퓨터가 생각하던 값은 " + n + "입니다.");
					count++;
					System.out.println(count + "번 만에 맞췄습니다.");
					break;
				}
			}
			switch ((count - 1) / 4) {
			case 0: {
				System.out.println("Great~!");
				break;
			}
			case 1: {
				System.out.println("Good~!");
				break;
			}
			case 2: {
				System.out.println("그럭저럭이군...");
				break;
			}
			case 3: {
				System.out.println("아쉽네..");
				break;
			}
			default:
				System.out.println("..분발을 요구함");
				break;
			}
		}
		System.out.println("종료");
	}
}
