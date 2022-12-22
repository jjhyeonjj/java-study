package kr.co.ezenac.javaex06;
//Student클래스에 생성자와 info()추가
public class StudentTest01 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		String str = s.info();
		System.out.println(str);
	
		// ========== 6-3 ==========
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.ban = 1;
		s2.no = 1;
		s2.kor = 100;
		s2.eng = 60;
		s2.math = 76;
		
		System.out.println("이름 : " + s2.name);
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAverage());
	}

	
}
