package oop6;

public class Single {
	// Lazy Initialization : 지연 초기화
	private static Single single;
	private Single() {}
	public static Single getInstance() {
		if (single == null) {
			single = new Single();
		}
		return single;
	}
}
