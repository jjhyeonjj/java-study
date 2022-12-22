package kr.co.ezenac.bong;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("보영이는 1, 진현이는 2를 입력하시오 : ");
		int who = scan.nextInt();
		if (who==1 || who==2) {
			System.out.println(who + "은(는) 몇월에 태어났게~?");
			int month = scan.nextInt();
			if (who==1 && month==7) {
				System.out.println("며칠이게~?");
				int day = scan.nextInt();
				if (who==1 && month==7 && day==15) {
					System.out.println("보영이는 "+month+"월 "+day+"일생 입니다.");
				} else {System.out.println(day + "일 아닌데ㅡㅡ");}
			} else if (who==2 && month==9) {
				System.out.println("며칠이게~?");
				int day = scan.nextInt();
				if (who==2 && month==9 && day==8) {
					System.out.println("진현이는 "+month+"월 "+day+"일생 입니다.");
				} else {System.out.println(day + "일 아닌데ㅡㅡ");}
			}else {System.out.println(month + "월 아닌데ㅡㅡ");}
		}else {System.out.println("나가주세요ㅡㅡ");}
		scan.close();
	}

}
