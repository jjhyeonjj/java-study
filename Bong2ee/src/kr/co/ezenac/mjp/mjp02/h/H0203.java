package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();
		
		int a = money/50000;
		int b = (money%50000)/10000;
		int c = ((money%50000)%10000)/1000;
		int d = (((money%50000)%10000)%1000)/100;
		int e = ((((money%50000)%10000)%1000)%100)/50;
		int f = (((((money%50000)%10000)%1000)%100)%50)/10;
		int g = ((((((money%50000)%10000)%1000)%100)%50)%10)/1;
		
		System.out.println("오만 원권 : "+ a+"매");
		System.out.println("만 원권 : "+ b+"매");
		System.out.println("천 원권 : "+ c+"매");
		System.out.println("100원 : "+ d+"개");
		System.out.println("50원 : "+ e+"개");
		System.out.println("10원 : "+ f+"개");
		System.out.println("1원 : "+ g+"개");
		
		scan.close();
	}
}
