package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("홍길동전", "허균");
		library[1] = new Book("홍길동전2", "허균2");
		library[2] = new Book("홍길동전3", "허균3");
		library[3] = new Book("홍길동전4", "허균4");
		library[4] = new Book("홍길동전5", "허균5");

		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());      	// 깊은복사
		}
		
		library[0].setTitle("구글 엔지니어는 이렇게 일한다");					// 원본 수정
		library[0].setAuthor("타이터스 윈터스");
		
		for(Book book : library)
			book.showInfo();
		System.out.println();
		
		for(Book book : copyLibrary)			// 수정전에 복사를 했기 떄문에 수정되지 않고 출력됨.
			book.showInfo();
		
		
		
	}

}
