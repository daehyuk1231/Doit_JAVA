package oop6;

public class Single2 {
	// Eager Initialization : 조기 초기화
	private static final Single2 single = new Single2();
	private Single2() {}
	public static Single2 getInstance() {
		return single;
	}
}
