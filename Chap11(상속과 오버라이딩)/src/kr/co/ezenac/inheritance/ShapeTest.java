package kr.co.ezenac.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		System.out.println();
		
		Circle circle2 = new Circle(new Point(150, 150), 500);
		circle2.draw();
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		System.out.println();

		Triangle triangle2 = new Triangle(new Point(0, 0), new Point(0, 50), new Point(100, 0));
		triangle2.draw();
		System.out.println();
		
		Point[] points = new Point[] {new Point(10, 10), new Point(80, 100), new Point(20, 120)};
		Triangle triangle3 = new Triangle(points);
		triangle3.draw();
		System.out.println();
		
		Point[] arr = new Point[3];
		arr[0] = new Point(0, 0);
		arr[1] = new Point(0, 1);
		arr[2] = new Point(1, 0);
		Triangle triangle4 = new Triangle(arr);
		triangle4.draw();
		
	}
}
