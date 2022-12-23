package kr.co.ezenac.array05;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();

		library.add(new Book("홍길동전", "허균"));
		library.add(new Book("홍길동전2", "허균2"));
		library.add(new Book("홍길동전3", "허균3"));
		library.add(new Book("홍길동전4", "허균4"));
		library.add(new Book("홍길동전5", "허균5"));
		
		for(int i=0; i<library.size(); i++)
			library.get(i).showInfo();
		
	}
}
