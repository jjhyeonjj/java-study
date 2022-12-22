package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int a = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
