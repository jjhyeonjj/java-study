package kr.co.ezenac.member;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();	// 인스턴스(student1) 생성
		student1.studentName = "이순신";		// 인스턴스의 멤버변수 studentName의 값을 "이순신"으로 한다. 
		student1.address = "Seoul";			// 인스턴스의 멤버변수 address의 값을 "Seoul"로 한다.
		student1.studentId = 100;			// 인스턴스의 멤버변수 studentId의 값을 100으로 한다.
		
		student1.showStudentInfo();			// 인스턴스의 메서드 showStudentInfo()를 호출한다.

		Student student2 = new Student();	// 인스턴스 생성
		student2.studentName = "신사임당";		// 인스턴스의 멤버변수 studentName의 값을 "신사임당"으로 한다. 
		student2.address = "Busan";			// 인스턴스의 멤버변수 address의 값을 "Busan"으로 한다.
		student2.studentId = 200;			// 인스턴스의 멤버변수 studentId의 값을 200으로 한다. 
		
		student2.showStudentInfo();			// 인스턴스의 메서드 showStudentInfo()를 호출한다. 
		
		//=======객체의 주소가 저장된 참조변수를 출력=======
		System.out.println(student1);
		System.out.println(student2);
	}

}
