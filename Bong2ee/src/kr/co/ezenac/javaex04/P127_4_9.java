package kr.co.ezenac.javaex04;

public class P127_4_9 {
// int 타입의 변수 num이 있을 때
	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("sum : " + sum);
	}

}
