package control;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		int com = (int) (Math.random() * 2) + 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력 > ");
		int you = sc.nextInt();
		sc.close();

		switch (you) {
		case 1: {
			System.out.println("com > " + com);
			if (com == 1) {
				System.out.println("비겼습니다.");
			} else if (com == 2) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("이겼습니다.");
			}
			break;
		}
		case 2: {
			System.out.println("com > " + com);
			if (com == 1) {
				System.out.println("이겼습니다.");
			} else if (com == 2) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("졌습니다.");
			}
			break;
		}
		case 3: {
			System.out.println("com > " + com);
			if (com == 1) {
				System.out.println("졌습니다.");
			} else if (com == 2) {
				System.out.println("이겼습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
		}
			System.out.println("종료");
		}
	}
}
