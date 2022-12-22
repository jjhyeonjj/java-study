package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0316_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String random[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("가위 바위 보! >> ");
			String user = scan.next();
			int r = (int)(Math.random()*3)+1;
			System.out.print("컴퓨터 : "+random[r-1]+", 사용자 : ");
			
			if(r==1) { //컴퓨터 : 가위
				if(user.equals("가위"))
					System.out.println((String)user+" , 비겼습니다.");
				else if(user.equals("바위"))
					System.out.println((String)user+" , 사용자 승!!");
				else if(user.equals("보"))
					System.out.println((String)user+" , 컴퓨터 승!!");
			}
			else if(r==2) { //컴퓨터 : 바위
				if(user.equals("가위"))
					System.out.println((String)user+" , 컴퓨터 승!!");
				else if(user.equals("바위"))
					System.out.println((String)user+" , 비겼습니다.");
				else if(user.equals("보"))
					System.out.println((String)user+" , 사용자 승!!");
			}
			else if(r==3) { //컴퓨터 : 보
				if(user.equals("가위"))
					System.out.println((String)user+" , 사용자 승!!");
				else if(user.equals("바위"))
					System.out.println((String)user+" , 컴퓨터 승!!");
				else if(user.equals("보"))
					System.out.println((String)user+" , 비겼습니다.");
			}
			if(user.equals("그만")) {
				System.out.println("종료"); break;
			}
		}
		scan.close();
			
	}
}
