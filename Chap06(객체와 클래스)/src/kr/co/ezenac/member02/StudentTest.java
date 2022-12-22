package kr.co.ezenac.member02;

public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student(202208, "정진현", 1);

		String result = student.showStudentInfo();		// 지역변수
		System.out.println(result);						// 메서드를 수행하고, 변수에 저장된 값을 출력
	}

}
