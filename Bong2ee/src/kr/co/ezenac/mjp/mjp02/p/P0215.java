package kr.co.ezenac.mjp.mjp02.p;

import java.util.Scanner;

public class P0215 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 선택");
		System.out.println("에스프레소 / 카푸치노 "
						+ "/ 카페라떼 / 아메리카노");
		String coffee = scan.next();
		
		switch(coffee) {
		case "아메리카노": {
			System.out.println("2000원입니다.");
			break;
		}		
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":{
			System.out.println("3500원 입니다.");
			break;
		}
		default: System.out.println("없는 메뉴 입니다.");
		}
		
		scan.close();
	}
}
