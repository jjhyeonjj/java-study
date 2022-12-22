package kr.co.ezenac.memory;

public class MemoryHeap {

	public static void main(String[] args) {

		//========인스턴스생성========
		Book book1 = new Book();
		Book book2 = new Book();
		
		//======인스턴스 멤버변수 num의 값 지정=======
		book1.num = 10;
		book2.num = 20;
		
		//====각각의 멤버변수에 지정된 num의 값 출력====
		System.out.println(book1.num);
		System.out.println(book2.num);
		
		//====참조변수에 저장된 객체의 주소를 null 값으로 초기화====
		book1 = null;
		book2 = null;
	}

}
