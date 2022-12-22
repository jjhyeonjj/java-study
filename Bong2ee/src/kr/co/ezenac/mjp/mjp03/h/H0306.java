package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("돈 입력>>");
		int	[]arr =
			{50000, 10000, 1000, 500, 100, 50, 10, 1};
	//arr[i]   0      1      2    3    4   5    6  7	
		int money = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			int a = money / arr[i];
			money %= arr[i];
			System.out.println(arr[i]+"원 "+a+"장");
		}
		scan.close();
	}
}
