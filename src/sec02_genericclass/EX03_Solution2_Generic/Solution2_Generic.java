package sec02_genericclass.EX03_Solution2_Generic;

class Apple {
}

class Pencil {
}

class Goods<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {
	public static void main(String[] args) {

		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();

		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();

		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
	}
}
