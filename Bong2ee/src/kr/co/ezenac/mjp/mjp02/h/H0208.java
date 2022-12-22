package kr.co.ezenac.mjp.mjp02.h;

import java.util.Scanner;

public class H0208 {
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2){
		  if ((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
		    { return true; }
		  else { return false; }
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x1, y1, x2, y2를 입력하세요 >> ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		if(inRect(x1, y1, 100, 200, 100, 200)
				|| inRect(x1, y2, 100, 200, 100, 200)
				|| inRect(x2, y1, 100, 200, 100, 200)
				|| inRect(x2, y2, 100, 200, 100, 200))
			System.out.println("충돌합니다.");
		else System.out.println("충돌하지 않습니다.");
		
		
		scan.close();
	}
}
