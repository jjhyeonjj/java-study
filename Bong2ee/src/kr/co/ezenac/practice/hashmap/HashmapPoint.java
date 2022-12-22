package kr.co.ezenac.practice.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashmapPoint {
	
	public static void main(String[] args) {
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
		Scanner scan = new Scanner(System.in);	
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = scan.next();
			if(name.equals("그만"))
				break;
			int point = scan.nextInt();
			if(a.get(name) == null) {
				a.put(name, point);
			}
			else {
				a.put(name, a.get(name)+point);
			}
			Set<String> key = a.keySet();
			Iterator<String>it = key.iterator();
			while(it.hasNext()) {
				String people = it.next();
				Integer sum = a.get(people);
				System.out.print("("+people+","+sum+")");
			}
			System.out.println();
			
		}
		scan.close();

	}
	
}

