package kr.co.ezenac.mjp.mjp04.p;

import java.util.Scanner;

public class Rectangle {

	int width;
	int height;
	
	public Rectangle(int width, int height) {
		//super();
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("너비와 높이 입력 >> ");
		int w = scan.nextInt();
		int h = scan.nextInt();
		Rectangle r = new Rectangle(w, h);
		System.out.println("사각형의 면적은 "+ r.getArea());
		
		scan.close();
	}
}
