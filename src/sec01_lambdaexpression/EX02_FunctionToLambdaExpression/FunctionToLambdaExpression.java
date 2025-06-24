package sec01_lambdaexpression.EX02_FunctionToLambdaExpression;

interface A {
	void method1();
}

interface B {
	void method2(int a);
}

interface C {
	int method3();
}

interface D {
	double method4(int a, double b);
}

public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력 x 리턴 x 함수");
			}
		};
		A a2 = () -> {
			System.out.println("입력 x 리턴 x 함수");
		};
		A a3 = () -> System.out.println("입력 x 리턴 x 함수");

		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("입력 O 리턴 x 함수");
			}
		};

		B b2 = (int a) -> {
			System.out.println("입력 O 리턴 x 함수");
		};
		B b3 = (a) -> {
			System.out.println("입력 O 리턴 x 함수");
		};
		B b4 = (a) -> System.out.println("입력 O 리턴 x 함수");
		B b5 = a -> System.out.println("입력 O 리턴 x 함수");

		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};

		C c2 = () -> {
			return 4;
		};
		C c3 = () -> 4;

		D d1 = new D() {
			@Override
			public double method4(int a, double b) {
				return a + b;
			}
		};
		D d2 = (int a, double b) -> {
			return a + b;
		};
		D d3 = (a, b) -> {
			return a + b;
		};
		D d4 = (a, b) -> a + b;
	}
}
