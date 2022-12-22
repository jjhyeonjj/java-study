package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0212_IfElse {
	
	public static void main(String[] args) {
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("연산 >> ");
	  double a = scan.nextDouble();
	  String s = scan.next();
	  double b = scan.nextDouble();
	  double result = 0.0;
	  
	  if (s.equals("+")) result = a+b;
	  else if (s.equals("-")) result = a-b;
	  else if (s.equals("*")) result = a*b;
	  else if (s.equals("/")) {
		 if (b != 0) result = a/b;
		 else System.out.println("0으로 나눌 수 없습니다.");
	  }
	  System.out.println(a + s + b + "의 계산 결과는 " + result);
	  
	  scan.close();
	}
}
