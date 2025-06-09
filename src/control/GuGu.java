package control;

public class GuGu {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i+=4) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
				System.out.print((i + 1) + "*" + j + "=" + ((i + 1) * j));
				System.out.print("\t");
				System.out.print((i + 2) + "*" + j + "=" + ((i + 2) * j));
				System.out.print("\t");
				System.out.print((i + 3) + "*" + j + "=" + ((i + 3) * j));
				System.out.println();
			}
			System.out.println();
		}
	}
}
