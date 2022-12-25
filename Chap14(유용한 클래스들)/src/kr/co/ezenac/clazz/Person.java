package kr.co.ezenac.clazz;

public class Person {

	private String name;
	private int age;
	
	// ========== 기본생성자 ==========
	public Person() {
		// TODO Auto-generated constructor stub
	}
	// ========== 매개변수(name)가 있는 생성자 ==========
	public Person(String name) {
		//super();
		this.name = name;
	}
	// ========== 매개변수(name, age)가 있는 생성자 ==========
	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	// ========== get & set ==========
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
	
	
	
	
	

}
