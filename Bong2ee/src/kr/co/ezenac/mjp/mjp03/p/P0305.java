package kr.co.ezenac.mjp.mjp03.p;

import java.util.Scanner;

public class P0305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 5개 입력 >> ");
		int count = 1;
		int sum = 0;
		
		for(; count<=5; count++) {
			int i = scan.nextInt();
			if(i>=0)
				sum += i;
			
		}
		System.out.println("양수들의 합: "+sum);
		
		scan.close();
	}
}
