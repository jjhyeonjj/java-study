package kr.co.ezenac.javaex04;

public class P125_4_3 {
// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	public static void main(String[] args) {
		
//		int sum1 = 0;
//		int sum2 = 0;
//		for(int i=0 ; i<=10; i++) {
//			sum1 += i;
//			sum2 += sum1;
//		}System.out.println(sum2);
//		========== 이렇게도 가능 ==========
		
		int sum = 0;
		for(int i=1; i<11; i++) {
			for(int j=1; j<i+1; j++) {
				sum += j;
			}
		}System.out.println(sum);
	}

}
