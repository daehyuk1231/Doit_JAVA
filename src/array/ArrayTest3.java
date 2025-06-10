package array;

public class ArrayTest3 {
	public static void main(String[] args) {

		int[][][] score = { { { 100, 90, 80, 70 }, { 90, 80, 70, 60 }, { 80, 70, 60, 50 } },
				{ { 100, 100, 90, 80 }, { 100, 90, 80, 70 }, { 90, 80, 70, 60 } } };

		for (int page = 0; page < score.length; page++) {
			System.out.println(page + 1 + "학기");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for (int row = 0; row < score[page].length; row++) {
				int total = 0;
				for (int col = 0; col < score[page][row].length; col++) {
					System.out.print(score[page][row][col] + "\t");
					total += score[page][row][col];
				}
				double avg = (double) total / score[page][row].length;
				System.out.print(total + "\t");
				System.out.printf("%.0f\n", avg);
			}
			System.out.println();
		}
		System.out.println("종료");
	}
}