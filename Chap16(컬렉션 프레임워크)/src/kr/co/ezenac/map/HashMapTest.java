package kr.co.ezenac.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());

		map.put("이순신", 95);
		map.put("정도전", 90);
		map.put("신사임당", 80);
		map.put("정도전", 95);		// 중복
		map.put("이성계", 95);
		
		System.out.println("사이즈 : " + map.size());
		System.out.println("값 : " + map.get("정도전"));		// 마지막값이 지정
		System.out.println();
		
		// map 컬렉션에 있는 key값만 Set계열로 바꿈
		Set<String> set = map.keySet();
		Iterator<String> iterator =  set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// map컬렉션의 Map.Entry 객체를 대상을 Set 계열로 바꿈
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()){
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key +" : "+ value);
		}
		System.out.println();
		
		//전체객체 삭제
		map.clear();
		System.out.println("사이즈 : " + map.size());

	}

}
