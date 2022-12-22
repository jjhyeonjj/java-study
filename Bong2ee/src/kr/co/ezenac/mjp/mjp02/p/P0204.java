package kr.co.ezenac.mjp.mjp02.p;

import java.util.Scanner;

public class P0204 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			System.out.print("이름 >> ");
			String name = scan.next();
			System.out.println("이름 : "+ name);
			
			System.out.print("도시 >> ");
			String city = scan.next();
			System.out.println("도시 : "+ city);
			
			System.out.print("나이 >> ");
			int age = scan.nextInt();
			System.out.println("나이 : "+ age);
			
			System.out.print("체중 >> ");
			double weight = scan.nextDouble();
			System.out.println("체중 : "+ weight);
			
			System.out.println("독신여부 >> ");
			boolean single = scan.nextBoolean();
			System.out.println("독신여부 : "+ single);
			
			scan.close();
		
	}
}
