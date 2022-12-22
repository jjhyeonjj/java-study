package kr.co.ezenac.mjp.mjp03.p;

import java.util.Scanner;

public class P0316 {

	public static void main(String[] args) {
		int arr[] = new int[4];
		
		try {
			for(int i=0; i<arr.length; i++) {
				arr[i+1] = i;
				System.out.println
				("arr["+(i+1)+"] = " + i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		}
	}
}
