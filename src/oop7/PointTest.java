package oop7;

public class PointTest {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.x = 100;
		p1.y = 200;

		// up casting
		Point2D p2 = new Point3D();
		p2.x = 1000;
		p2.y = 2000;
//		p2.z = 3000;
		
		// down casting
		Point3D p3 =(Point3D) p2;
		p3.x = 1000;
		p3.y = 2000;
		p3.z = 3000;
	}
}
