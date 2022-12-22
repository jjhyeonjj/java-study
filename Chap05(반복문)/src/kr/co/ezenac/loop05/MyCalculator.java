package kr.co.ezenac.loop05;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			showMenu();
			char myChar = scan.next().charAt(0); // charAt: 문자열에서 첫번쨰가 0번째
			if ( !checkNum(myChar) ) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
			}
			int num = myChar - '0';
			/*
			 * 			 '1' - '0'
			 * 			  49 - 48
			 * 			  = 1	
			 */
			System.out.println(num);
			if (num == 0) {
				break;
			}
			else {
				if (num > 4) {
					System.out.println("메뉴를 잘못 선택했습니다.");
					continue;
				}
				
			//==================== 사칙연산 ====================
				System.out.println("첫 번째 숫자 : ");
				int num1 = scan.nextInt();
				
				System.out.println("두 번째 숫자 : ");
				int num2 = scan.nextInt();
				
				if (num == 1)
					addNum(num1, num2);
				else if (num == 2)
					minusNum(num1, num2);
				else if (num == 3)
					multiplyNum(num1, num2);
				else if (num == 4)
					divideNum(num1, num2);
			}
		}
		System.out.println("계산기를 종료합니다.");
		
		scan.close();
	}
	
//====================== 사칙연산 메소드 =====================	
	public static void divideNum(int x, int y) {
		int result = x / y;
		System.out.println(x + "/" + y + "=" + result);
		
		int result1 = x % y;
		System.out.println(x + "%" + y + "=" + result1);	
	}

	public static void multiplyNum(int x, int y) {
		int result = x * y;
		System.out.println(x + "*" + y + "=" + result);	
	}

	public static void minusNum(int x, int y) {
		int result = x - y;
		System.out.println(x + "-" + y + "=" + result);	
		}

	public static void addNum(int x, int y) {
			int result = x + y;
			System.out.println(x + "+" + y + "=" + result);
	}

//==================== checkNum 메소드 ====================
	public static boolean checkNum(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		else return false;
	}
//==================== showMenu 메소드 ====================
	public static void showMenu() {

		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 더하기");
		System.out.println("2. 뺴기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 끝내기");
		
	}

}
