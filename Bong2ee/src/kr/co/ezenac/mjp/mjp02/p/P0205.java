package kr.co.ezenac.mjp.mjp02.p;

import java.util.Scanner;

public class P0205 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("초 단위의 정수를 입력하세요.");
		
		int time = scan.nextInt();
		
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time+"초는 "+hour+"시간 "+minute+"분 "+second+"초입니다.");
		
		
		
		
		scan.close();
	}

}
