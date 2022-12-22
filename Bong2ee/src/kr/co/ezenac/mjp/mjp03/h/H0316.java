package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.println("가위 바위 보! >> ");
			String user = scan.next();
			int com = (int)(Math.random()*3)+1;
			if(com == 1) { // 컴퓨터 >> 가위
				System.out.print ("사용자: "+(String)user+", 컴퓨터: 가위,");
				if(user.equals("가위"))
					System.out.println("비겼습니다.");
				else if(user.equals("바위"))
					System.out.println("사용자 승!!");
				else if(user.equals("보"))
					System.out.println("컴퓨터 승!!");
			}
			else if(com == 2) { // 컴퓨터 >> 바위
				System.out.print ("사용자: "+(String)user+", 컴퓨터: 바위,");
				if(user.equals("가위"))
					System.out.println("컴퓨터 승!!");
				else if(user.equals("바위"))
					System.out.println("비겼습니다.");
				else if(user.equals("보"))
					System.out.println("사용자 승!!");
			}
			else if(com == 3) { // 컴퓨터 >> 보
				System.out.print ("사용자: "+(String)user+", 컴퓨터: 보,");
				if(user.equals("가위"))
					System.out.println("사용자 승!!");
				else if(user.equals("바위"))
					System.out.println("컴퓨터 승!!");
				else if(user.equals("보"))
					System.out.println("비겼습니다.");
			}
			if(user.equals("그만")) {
				System.out.println("종료");
				break;
			}
		}
		scan.close();
	}
}
