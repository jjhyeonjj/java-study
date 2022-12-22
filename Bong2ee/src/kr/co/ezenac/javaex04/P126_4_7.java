package kr.co.ezenac.javaex04;

public class P126_4_7 {
// 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드
	public static void main(String[] args) {

		String str = "12345";
	
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			 sum += str.charAt(i)-'0';
			 
		}
		System.out.println("sum = " + sum);
	}

}
