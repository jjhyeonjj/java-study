package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		
		String str = scan.next();
		char ch = str.charAt(0);
		
		for(int i=0; i<=ch-'a'; i++) {
			for(char ch2='a'; ch2<=ch; ch2++) {
				System.out.print((char)ch2);
			}
			ch--;
			i--;
			System.out.println();
		}
		scan.close();
	}
}
