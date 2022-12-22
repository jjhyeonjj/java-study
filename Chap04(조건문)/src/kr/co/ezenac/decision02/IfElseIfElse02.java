package kr.co.ezenac.decision02;

import java.util.Scanner;

/*
 * 사용자로부터 나이를 입력받아서
 * 8보다 작으면 : 미취학 아동입니다. 입장료 1000원입니다.
 * 14보다 작으면 : 초등학생 입니다. 입장료는 2000원입니다.
 * 20보다 작으면 : 중, 고등학생 입니다. 입장료는 2500원입니다.
 * 그 외 : 일반인입니다. 입장료는 3000원입니다. 
 */

public class IfElseIfElse02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		int charge;
		
		if (age < 8) {
			System.out.println("미취학 아동입니다.");
			charge = 1000;
		}
		else if (age < 14) {
			System.out.println("초등학생입니다.");
			charge = 2000;
		}
		else if (age < 20) {
			System.out.println("중, 고등학생입니다.");
			charge = 2500;
		}
		else {
			System.out.println("일반인입니다.");
			charge = 3000;
		}
		System.out.println("입장료는 " + charge + "입니다.");
		scan.close();
	}

}
