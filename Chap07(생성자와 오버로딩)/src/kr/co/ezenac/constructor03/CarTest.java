package kr.co.ezenac.constructor03;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car);
		
		Car car2 = new Car("흰색", "오토", 5);
		System.out.println(car2.toString());
	}
}
