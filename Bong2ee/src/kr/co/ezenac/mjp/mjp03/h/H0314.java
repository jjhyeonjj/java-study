package kr.co.ezenac.mjp.mjp03.h;

import java.util.Scanner;

public class H0314 {

	public static void main(String[] args) {
		String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	    int course1[]={95, 88, 76, 62, 55};
	    Scanner scan = new Scanner(System.in);
	         
		 for(int i=0; ;i++) {
		 System.out.print("과목 이름 >> ");
		 String subject = scan.next();
			 if(subject.equals(course[i]))
			    System.out.println(course[i] + "의 점수는 " + course1[i] + "점 입니다.");
			 else if (subject.equals("그만"))
			    break;
			 else 
			    System.out.println("없는 과목입니다.");
		 }
		 scan.close();
	}
	   
}
