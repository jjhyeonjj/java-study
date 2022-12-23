package kr.co.ezenac.constructor02;

public class StudentTest {

	public static void main(String[] args) {

		//========== 기본생성자 호출 ==========
		Student student = new Student();
		//System.out.println(student.getAge());			//값을 정해주지 않아 기본값이 0이 나옴. 
		System.out.println(student.toString());			//값을 정해주지 않아 기본값 null, 0이 나옴
		
		System.out.println();
		
		//========== 매개변수가 있는 생성자 호출 ==========
		Student student2 = new Student("이순신", 25);
		System.out.println(student2);
		
		System.out.println();
		
		//========== 매개변수가 String만 있는 생성자 호출 ==========
		Student student3 = new Student("신사임당");
		System.out.println(student3.toString());		//Age값을 정해주지 않아 기본값 0이 나옴.
		
		System.out.println();
		
		//========== 매개변수가 int만 있는 생성자 호출 ==========
		Student student4 = new Student(20);
		System.out.println(student4);					//Name값을 정해주지 않아 기본값 null이 나옴.
	}

}
