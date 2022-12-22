package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0206 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int i = scan.nextInt();
		int a;
		int b;
		
		if(i > 0 && i <= 99) {
			a = i / 10;
			b = i % 10;
			if((a % 3 == 0) && (b % 3 == 0)) 
				System.out.println("박수 짝짝");
			else if ((a % 3 == 0 ) || (b % 3 == 0)) 
				System.out.println("박수 짝");
		}
		else System.out.println("잘못된 값입니다.");
		
	
		scan.close();
	}
}
