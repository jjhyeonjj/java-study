package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0205 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a+b)>c && (a+c)>b && (b+c)>a)
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 안됩니다.");

		scan.close();
	}
}
