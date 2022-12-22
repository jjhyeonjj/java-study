package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0204 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if((a<b && a>c)||(a>b && a<c))
			System.out.println("중간 값은 "+a);
		else if((b<a && b>c) || (b<c && b>a))
			System.out.println("중간 값은 "+b);
		else
			System.out.println("중간 값은 "+c);
		
		scan.close();
	}
}
