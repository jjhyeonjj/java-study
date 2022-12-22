package kr.co.ezenac.javaex04;

import java.util.Scanner;

public class P128_4_10 {
// 숫자맞히기 게임
	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;					// 사용자입력을 저장할 공간
		int count = 0;					// 시도횟수를 세기위한 변수
		
		Scanner scan = new Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = scan.nextInt();
			
			if(input == answer) {
				System.out.println("맞혔습니다.");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			} else if(input < 1 || input > 100) {
				System.out.println("잘못된 입력값입니다.");
			}
			  else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("더 작은 수를 입력하세요.");
			}
		} while(true);
		
		scan.close();
	}

}
