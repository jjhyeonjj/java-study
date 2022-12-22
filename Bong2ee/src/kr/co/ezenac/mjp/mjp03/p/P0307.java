package kr.co.ezenac.mjp.mjp03.p;

import java.util.Scanner;

public class P0307 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양수 5개 입력 >> ");
		int arr[] = new int[5];
		int big = 0;
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] > big)
				big = arr[i];
		}
		System.out.println("제일 큰 수 : "+big);
		
		scan.close();
	}
}
