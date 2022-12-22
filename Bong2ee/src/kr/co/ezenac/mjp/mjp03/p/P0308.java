package kr.co.ezenac.mjp.mjp03.p;

import java.util.Scanner;

public class P0308 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		System.out.print(arr.length+"개 정수 입력 : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		System.out.println
		("평균 : " + (double)sum / arr.length);
			
		scan.close();
		
	}
}
