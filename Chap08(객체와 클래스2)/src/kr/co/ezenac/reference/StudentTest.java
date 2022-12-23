package kr.co.ezenac.reference;

public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student(100, "이순신");
		
		student.setKoreanSubject("국어", 100);
		student.setMathSubject("수학", 100);
		
		student.showStudentScore();
		
		Student student2 = new Student(200, "신사임당");
		
		student2.setKoreanSubject("국어", 60);
		student2.setMathSubject("수학", 56);
		
		student2.showStudentScore();
	}

}
