package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("이보영 똑순이");
		sList.add("엡뿐둥이 겸둥이");
		sList.add("곤주");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		sList.stream().filter(s -> s.length() >= 8).forEach(s -> System.out.print(s + "\t"));
		
		
	}
}
