package kr.co.ezenac.mjp.mjp04.p;

public class Circle {

	int radius;
	String name;
	
	public Circle(String name, int radius) {
		//super();
		this.name = name;
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle("자바피자", 10);
		System.out.println((String)pizza.name +"의 면적은 "+ (double)pizza.getArea());
	
		Circle donut = new Circle("든킨", 2);
		System.out.println(donut.name + "의 면적은 " + donut.getArea());
	}
}
