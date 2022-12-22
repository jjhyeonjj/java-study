package kr.co.ezenac.javaex04;

public class P125_4_2 {
//	1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
	public static void main(String[] args) {
		
		int x = 1;
		int sum = 0;
		for(x = 1; x <= 20; x++) {
			if(x % 2 == 0 || x % 3 == 0) {
				continue;
			} else {
				sum += x;
			}
			
//			if(x % 2 != 0 && x % 3 != 0) {
//				sum += x;
//			}
//	 		========== 이렇게도 가능 ==========
		} System.out.println(sum);
	}

}
