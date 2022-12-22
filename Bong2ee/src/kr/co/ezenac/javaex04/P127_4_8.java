package kr.co.ezenac.javaex04;

public class P127_4_8 {
// Math.random()을 이용해 1~6 사이의 임의의 정수를 변수 value에 저장하는 코드
	public static void main(String[] args) {
		
		int value = (int)(Math.random()*6)+1;
		
		System.out.println("value : " + value);
		
	}

}
