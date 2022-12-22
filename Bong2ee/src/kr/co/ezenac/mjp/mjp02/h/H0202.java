package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 자릿수 정수 입력(10~99) >> ");
		int i = scan.nextInt();
		
		if((i/10) == (i%10))
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
		
		scan.close();
	}
}
