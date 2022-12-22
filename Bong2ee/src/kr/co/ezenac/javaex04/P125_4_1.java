package kr.co.ezenac.javaex04;

public class P125_4_1 {
// 조건식 표현
	public static void main(String[] args) {
//	1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 17;
		if(x > 10 && x < 20) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//	2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 'a';
		if(!(ch == ' ' && ch == '\t')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//	3. char형 변수 ch1이 'x' 또는 'X'일 때 true인 조건식
		char ch1 = 'x';
		if(ch1 == 'x' || ch1 == 'X') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//	4. char형 변수 ch2가 숫자('0'~'9')일 때 true인 조건식
		char ch2 = '3';
		if(ch2 >= '0' && ch2 <= '9') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//	5. char형 변수 ch3이 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch3 = 'J';
		if((ch3 > 'A' && ch3 < 'Z')||(ch3 > 'a' && ch3 < 'z')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//	6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
		int year = 400;
		if((year % 400 == 0)||(year % 4 ==0 && year % 100 != 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//	7. boolean형 변수 powerOn이 false일 때 true인 조건식
		boolean powerOn = false;
		if(powerOn == false) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//	8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
		String str = "yes";
		if(str == "yes") {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
