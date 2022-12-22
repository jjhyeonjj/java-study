package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0303_Pyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>>");
		int a = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a-i; j++)
				System.out.print(" ");
			for(int k=0; k<i*2+1; k++)
				System.out.print("*");
			System.out.println();
		}
		scan.close();
	}
}
