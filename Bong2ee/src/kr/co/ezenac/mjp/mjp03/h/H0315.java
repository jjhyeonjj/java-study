package kr.co.ezenac.mjp.mjp03.h;

import java.util.InputMismatchException;
import java.util.Scanner;

public class H0315 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
					System.out.println("곱하고자 하는 두 수 입력 >>");
					int n = scan.nextInt();
					int m = scan.nextInt();
					System.out.println(n+"X"+m+"="+n*m);
					break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scan.nextLine();
				continue;
			}
		}
		
		scan.close();
	}
}
