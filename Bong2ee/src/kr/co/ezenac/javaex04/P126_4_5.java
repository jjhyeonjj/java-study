package kr.co.ezenac.javaex04;

public class P126_4_5 {
// for문을 while문으로 변경
	public static void main(String[] args) {
		
//		for(int i = 0; i <= 10; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.println("*");
//				System.out.println();
//			}
//		}	  for 문
//				||
//				\/
//		     while 문
		int i = 0;
		int j = 0;
		while(i <= 10) {
			while(j <= i) {
				System.out.println("*");
				System.out.println();
				j++;
			} i++;
		}
		
//		int i1 = 0; 
//		int j1 = 0;
//		while (i1 <= 10) {
//			while (j1 <= i1) {
//				System.out.println("*");
//				System.out.println();
//				j1++;
//			} i1++;
//		} 
	}

}
