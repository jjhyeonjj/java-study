package kr.co.ezenac.mjp.mjp03.p;

import java.util.Scanner;

public class P0314_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			System.out.print("두 정수 입력 >> ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			try {
				System.out.println
				(a+" / "+b+"의 몫은 "+a/b+"입니다.");
			} catch (ArithmeticException e) {
				System.out.println
				("예외가 발생하여 프로그램을 강제종료합니다.");
				break;
			}
		}
		scan.close();
	}
}
