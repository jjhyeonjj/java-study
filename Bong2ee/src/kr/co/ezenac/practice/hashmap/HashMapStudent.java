package kr.co.ezenac.practice.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudent {

	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<String, Double>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("미래장학금관리시스템입니다.");
		
		while(true) {
			System.out.println("이름과 학점 >> ");
			String name = scan.next();
			if(name.equals("그만"))
				break;
			double grade = scan.nextDouble();
			map.put(name, grade);
		}
		System.out.println("장학생 선발 학점 기준 입력 >> ");
		double standard = scan.nextDouble();
		System.out.println("장학생 명단 : ");
		Set<String> nameSet = map.keySet();
		Iterator<String> it = nameSet.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			double grade = map.get(name);
			if(grade > standard)
				System.out.print(name+" ");
			
		}
		System.out.println();
		scan.close();
		
		
	}
	
}
