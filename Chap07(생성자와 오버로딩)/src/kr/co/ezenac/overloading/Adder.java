package kr.co.ezenac.overloading;

public class Adder {

	//add() 메서드명으로 오버로딩함.
	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		System.out.println("int x : " + x + ", int y : " + y);
		return x + y;
	}
	
//	==================== 변수명과 리턴타입이 다르다고 오버로딩이 아님 ====================
//	public int add(int a, int b) {
//		return a + b;
//	}
//	
//	public long add(int x, int y) {
//		return x + y;
//	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x + y;
	}
}
