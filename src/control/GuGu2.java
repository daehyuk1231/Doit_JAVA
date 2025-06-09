package control;

public class GuGu2 {
	public static void main(String[] args) {
		for (int i = 2; i <= 2; i++) {
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
			for (int j = 1; j <= 9; j++) {
				System.out.print((i + 4) + "*" + j + "=" + (i + 4) * j);
				System.out.print("\t");
				System.out.print((i + 5) + "*" + j + "=" + ((i + 5) * j));
				System.out.print("\t");
				System.out.print((i + 6) + "*" + j + "=" + ((i + 6) * j));
				System.out.print("\t");
				System.out.print((i + 7) + "*" + j + "=" + ((i + 7) * j));
				System.out.println();
			}
		}
	}
}
