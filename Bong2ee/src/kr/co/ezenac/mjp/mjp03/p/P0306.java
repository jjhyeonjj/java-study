package kr.co.ezenac.mjp.mjp03.p;

import java.util.Scanner;

public class P0306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("종료하려면 exit 입력");
		while(true) {
			System.out.print("입력 : ");
			String str = scan.next();
			if(str.equals("exit")) {
				System.out.println("종료");
				break;
			}
		}
		scan.close();
	}
}
