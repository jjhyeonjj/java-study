package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수 10개 입력>> ");
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		scan.close();
	}
}
