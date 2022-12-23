package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student {

	private int studenId;				// 멤버변수
	private String studentName;			// 멤버변수
	
	//______________타입 __________참조변수
	ArrayList<Book> bookList;
	
	// 생성자
	public Student(int studentId, String studentName) {
		//super();
		this.studenId = studentId;
		this.studentName = studentName;
		
		bookList = new ArrayList<>();
	}
	// 책을 추가하는 기능
	public void addBook(String title, String author) {
		Book book = new Book();
		
		book.setTitle(title);
		book.setAuthor(author);
		
		bookList.add(book);
	}
	
	public void showInfo() {
		System.out.println(this.studentName +" 학생이 읽은 책은 : ");
		
		for(Book book : bookList) {
			System.out.print(book.getTitle() +" ");
			
			System.out.println("입니다.");
			
		}
		
	}
	
	
	
	
}
