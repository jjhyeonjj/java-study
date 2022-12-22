package kr.co.ezenac.bong;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("과목 1 : ");
		int num1 = scan.nextInt();
		System.out.println("과목 2 : ");
		int num2 = scan.nextInt();
		System.out.println("과목 3 : ");
		int num3 = scan.nextInt();
		System.out.println("과목 4 : ");
		int num4 = scan.nextInt();
		System.out.println("과목 5 : ");
		int num5 = scan.nextInt();
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("총 개수 : " + sum);
		
		if (num1 >= 8 && num2 >= 8 && num3 >= 8 && num4 >= 8 && num5 >= 8 && sum >= 60) {
			System.out.println("합격!");
			if (sum == 100) {
				System.out.println("만점~!");
			}
			
		}
		else {
			System.out.println("불합격");
		}
		
		
		scan.close();
		

	}

}
