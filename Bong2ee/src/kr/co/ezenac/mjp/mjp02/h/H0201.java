package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0201 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int won = scan.nextInt();
		
		double dollar = won / 1100;
		System.out.println(won+"원은 "+"$"+dollar+"입니다.");
		
		scan.close();
	}
}
