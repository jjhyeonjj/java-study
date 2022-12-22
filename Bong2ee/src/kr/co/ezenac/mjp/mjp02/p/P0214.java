package kr.co.ezenac.mjp.mjp02.p;

import java.util.Scanner;

public class P0214 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		
		switch(score/10) {
		case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default: System.out.println("F"); break;
		}
		scan.close();
	}
}
