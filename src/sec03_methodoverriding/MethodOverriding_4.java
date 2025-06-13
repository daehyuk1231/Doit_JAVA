package sec03_methodoverriding;

class C {
	protected void abc() {
	}
}

class B1 extends C {
	public void abc() {
	}
}

class B2 extends C {
	protected void abc() {
	}
}

class B3 extends C {
}

class B4 extends C {
}

public class MethodOverriding_4 {
	public static void main(String[] args) {
	}
}
