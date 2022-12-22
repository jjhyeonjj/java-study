package kr.co.ezenac.practice.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapCountry {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String country = scan.next();
			if(country.equals("그만"))
				break;
			int population = scan.nextInt();
			map.put(country, population);
		}
		
		while(true) {
			System.out.println("인구 검색>>");
			String country = scan.next();
			if(country.equals("그만"))
				break;
			Integer p = map.get(country);
			if(p == null) {
				System.out.println(country + "나라는 없습니다.");
			}
			else {
				System.out.println(country + "의 인구는 " + p);
			}
		}
		scan.close();
		
	}
	
}
