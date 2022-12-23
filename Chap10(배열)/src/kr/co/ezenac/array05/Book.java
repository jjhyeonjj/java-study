package kr.co.ezenac.array05;

public class Book {

	private String title;
	private String author;
	// =============== 기본 생성자 ===============
	public Book() {
	
	}
	//=============== 매개변수가 있는 생성자 ===============
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	// =============== get & set ===============
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// =============== showInfo 메서드 ===============
	public void showInfo() {
		System.out.println(title + ", " + author);
	}
}
