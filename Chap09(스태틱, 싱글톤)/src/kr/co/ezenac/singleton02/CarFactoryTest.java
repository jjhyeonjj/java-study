package kr.co.ezenac.singleton02;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory carFactory = CarFactory.getInstance();
		CarFactory carFactory2 = CarFactory.getInstance();
		Car bmwi4 = carFactory.createCar();
		Car bmwix = carFactory.createCar();
		Car cayenne = carFactory.createCar();
		
		System.out.println(bmwi4.getCarNum());
		System.out.println(bmwix.getCarNum());
		System.out.println(cayenne.getCarNum());
		System.out.println();
		
		System.out.println(bmwi4);
		System.out.println(bmwix);
		System.out.println(cayenne);
		System.out.println();
		
		System.out.println(carFactory);
		System.out.println(carFactory2);
	}
}
