package sec01_theneedforgeneric.EX02_Solution1_UsingObject;

class Apple {
}

class Pencil {
}

class Goods {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

public class Solution1_UsingObject {
	public static void main(String[] args) {

		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple) goods1.getObject();

		Goods goods2 = new Goods();
		goods2.setObject(new Apple());
		Pencil pencil = (Pencil) goods2.getObject();
	}
}
