package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0308 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("저장할 정수의 수>> ");
		int a = scan.nextInt();
		int arr[] = null;
		if(1<=a && a<=100) {
			arr = new int[a];
		}
		else
			System.out.println("잘못된 값!!");
		
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*100+1);
			arr[i] = r;
			System.out.print(arr[i]+"\t");
		}
		scan.close();
	}
}
