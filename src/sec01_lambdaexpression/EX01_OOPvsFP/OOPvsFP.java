package sec01_lambdaexpression.EX01_OOPvsFP;

interface A {
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("메서드 내용 1");
	}
}

public class OOPvsFP {
	public static void main(String[] args) {

		A a1 = new B();
		a1.abc();

		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		a2.abc();

		A a3 = () -> {
			System.out.println("메서드 내용 3");
		};
		a3.abc();
	}
}
