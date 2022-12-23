package kr.co.ezenac.array02;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		
		book[0] = new Book("홍길동전", "허균");
		book[1] = new Book("홍길동전2", "허균2");
		book[2] = new Book("홍길동전3", "허균3");
		book[3] = new Book("홍길동전4", "허균4");
		book[4] = new Book("홍길동전5", "허균5");
		
		for(int i=0; i<book.length; i++) {
			//System.out.println(book[i].toString());	주소번지 출력
			book[i].showInfo(); 					// 메서드 사용 => 내용확인
		}
	}
}
