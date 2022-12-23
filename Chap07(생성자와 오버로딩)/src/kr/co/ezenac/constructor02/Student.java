package kr.co.ezenac.constructor02;

public class Student {

	//========== 멤버변수 선언 ==========
	private String name;
	private int age;
	
	//========== 기본 생성자 ==========
	public Student() {
		System.out.println("기본 생성자 호출");
	}

	//========== 매개변수가 있는 생성자 추가(overloading) ==========
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		//super();
		this.name = name;
		this.age = age;
	}

	//========== 매개변수가 String만 있는 생성자 추가(overloading) ==========
	public Student(String name) {
		System.out.println("매개변수가 String만 있는 생성자 호출");
		//super();
		this.name = name;
	}

	//========== 매개변수가 int만 있는 생성자 추가(overloading) ==========
	public Student(int age) {
		System.out.println("매개변수가 int만 있는 생성자 호출");
		//super();
		this.age = age;
	}
	
	//========== 멤버메서드 ==========
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		
		return this.getName() +", "+ this.getAge();
	}
}
