package kr.co.ezenac.loop;

//처음으로 누적합계가 2000이상일 때 i의 값을 출력하시오.

public class ForTest02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int temp = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i;
			if (sum >= 2000) {
				temp = i;
				break;			// 감싸고 있는 제어문의 블록을 빠져 나오는 기능
			}
			//System.out.println("sum : " + sum);
		}
		System.out.println("처음 누적합계가 2000이상일 때 i의 값 : " + temp);
		System.out.println("누적합계 : " + sum);
	}

}
