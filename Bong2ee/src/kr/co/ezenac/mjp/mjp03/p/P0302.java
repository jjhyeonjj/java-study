package kr.co.ezenac.mjp.mjp03.p;

import java.util.Scanner;

public class P0302 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 후 -1을 입력하세요.");
		int i = scan.nextInt();
		int sum = 0;
		int count = 0;
		
		while(i != -1) {
			sum += i;
			count++;
			i = scan.nextInt();
		}
		System.out.println("평균 : "+ (double)(sum / count));
		
		scan.close();
	}
}
