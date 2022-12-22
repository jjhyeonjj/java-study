package kr.co.ezenac.practice.array;

import java.util.Scanner;

class Day {
	   private String work; //하루의 할 일을 나타내는 문자열
	   public void set(String work) { this.work = work; }
	   public String get() { return work; }
	   public void show() {
	      if(work == null) System.out.println("없습니다.");
	      else System.out.println(work+"입니다.");
	   }
	}

public class MonthSchedule {
	private Scanner scan;
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		
		while(true) {
			System.out.print("할일(입력: 1, 보기: 2, 끝내기: 3 >> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return; 
			}
		}
	}
	
	public void input() {
		System.out.print("날짜(1~30)?");
		int day = scan.nextInt();
	}
	
	public void view() {
			// TODO Auto-generated method stub
			
		}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	


	
	public static void main(String[] args) {
		MonthSchedule a = new MonthSchedule();
		a.run();
	}
}
