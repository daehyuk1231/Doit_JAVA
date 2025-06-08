package basic;

import java.math.BigDecimal;

public class PrimitiveTypes {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		
//		byte b2 = 129;
		
		char c = '뷁';
		System.out.println(c);

		int i = 2147483647 + 1;
		System.out.println(i);

		short sh = 32767;
		System.out.println(sh);

		long lo = 2147483648L;
		System.out.println(lo);

		double d = 3.1415926535;
		System.out.println(d);
		
		float f = 3.1415926535f;
		System.out.println(f);
		
		System.out.println(2 - 1.1);
		
		BigDecimal bi = new BigDecimal("2");
		System.out.println(bi.subtract(new BigDecimal("1.1")));
	}
}
