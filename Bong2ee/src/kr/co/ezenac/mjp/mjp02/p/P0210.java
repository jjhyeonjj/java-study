package kr.co.ezenac.mjp.mjp02.p;

import java.util.Scanner;

public class P0210 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score>=80 && score<=100)
			System.out.println("합격");
		else System.out.println("불합격");
		
		scan.close();
	}
}
