package kr.co.ezenac.decision04;

public class MethodTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 30;
		
		//Call by value (값에 의한 복사)
		int result = add(num1, num2);
		System.out.println("num1 + num2 : " + result);
		
		//Call by value (값에 의한 복사)
		result = minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		//multiply()
		result = multiply(num1, num2);
		System.out.println("num1 * num2 : " + result);
		
		//divide()
		result = divide(num1, num2);
		System.out.println("num1 / num2 : " + result);

	}
	/*
	 * 메서드 선언부 구성
	 *  1. 리턴타입(반환값) : int
	 *  2. 메서드명
	 *  3. () : 매개변수, 인자값, arguments
	 *  
	 *    메서드 구현부 {}
	 */
	public static int add(int x, int y) {
		System.out.println("add 메서드 호출");
		
		int temp;
		temp = x + y;
		
		return temp;
	}
	public static int minus(int x1, int y1) {
		System.out.println("minus 메서드 호출");
		return x1 - y1;
	}
	private static int multiply(int x2, int y2) {
		System.out.println("multiply 메서드 호출");
		return x2 * y2;
	}
	private static int divide(int x3, int y3) {
		System.out.println("divide 메서드 호출");
		return x3 / y3;
	}
}
