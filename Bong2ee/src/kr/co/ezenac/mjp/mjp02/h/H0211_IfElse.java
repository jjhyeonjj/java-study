package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0211_IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >> ");
		int month = scan.nextInt();
		
		if(3 <= month && month <= 5)
			System.out.println("봄");
		else if(6 <= month && month <= 8)
			System.out.println("여름");
		else if(9 <= month && month <= 11)
			System.out.println("가을");
		else if(month==12 || month==1 || month==2)
			System.out.println("겨울");
		else 
			System.out.println("잘못된 값입니다.");
		
		scan.close();
	}
}
