package kr.co.ezenac.mjp.mjp04.p;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
	
		Book book = new Book("어린왕자", "생텍쥐페리");
		System.out.println(book.title+" "+book.author);
		
		Book book2 = new Book("춘향뎐", "작자미상");
		System.out.println(book2.title+" "+book2.author);
	}
}
