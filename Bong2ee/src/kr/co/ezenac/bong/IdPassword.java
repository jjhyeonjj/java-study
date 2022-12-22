package kr.co.ezenac.bong;

import java.util.Scanner;

public class IdPassword {
	
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "1111";
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = scan.nextLine();
		if (id.equals(ADMIN_ID)) {
			System.out.println("PW : ");
			String pw = scan.nextLine();
			if (pw.equals(ADMIN_PASSWORD)) {
				System.out.println("Right");
			} else {
				System.out.println("PW Error");
			}
		} else {
			System.out.println("ID Error");
		} scan.close();
	} 
}
