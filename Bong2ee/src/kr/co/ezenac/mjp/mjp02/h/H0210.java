package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0210 {
	public static void main(String[] args) {
		System.out.print("첫 번째 원의 중심과 반지름 입력>>");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		double r=scan.nextDouble();
		
		System.out.print("두 번째 원의 중심과 반지름 입력>>");
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		double r1=scan.nextDouble();
		double distance=0;
		distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		if (distance<=r+r1) 
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 안겹친다.");
		scan.close();	
	}

}
