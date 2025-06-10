package sec01_array.EX10_ArgumentOfMainMethod;

public class ArgumentOfMainMethod {
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println();

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();

		for (String s : args) {
			System.out.println(s);
		}
		System.out.println();
	}
}
