package control;

public class DoWhileTest2 {
	public static void main(String[] args) {
		int i = 4, sum = 0;
		do {
			sum += i;
			i += 4;
		} while (i <= 1000);
		System.out.println(sum);
		System.out.println("종료");
	}
}
