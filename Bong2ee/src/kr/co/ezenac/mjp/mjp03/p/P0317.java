package kr.co.ezenac.mjp.mjp03.p;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P0317 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      System.out.println("정수 3개를 입력하세요");
	      int sum=0, n=0;
	      for(int i=1; i<=3; i++){
	         System.out.print(i+"번째>>");
	         try{
	            n=scan.nextInt();
	         }catch(InputMismatchException e){
	             System.out.println("정수가 아닙니다. 다시 입력하세요");
	             scan.next();
	             i--;
	             continue;
	         }
	         sum+=n;
	       }
	       System.out.println("합은 "+sum);
	       scan.close();
	}
}
