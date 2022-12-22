package kr.co.ezenac.mjp.mjp02.p;

import java.util.Scanner;

public class P0211 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int i = scan.nextInt();
		if(i % 3 == 0)
			System.out.println("3의 배수입니다.");
		else System.out.println("3의 배수가 아닙니다.");
		
		scan.close();
	}
}
