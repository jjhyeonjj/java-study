package kr.co.ezenac.mjp.mjp02.p;

import java.util.Scanner;

public class P0213 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		System.out.println("학년 입력 : ");
		int grade = scan.nextInt();
		
		if((grade < 4 && score >= 60)
			|| (grade == 4 && score >= 70)) {
			System.out.println("합격");
		} else System.out.println("불합격");
		
		scan.close();
	}
}
