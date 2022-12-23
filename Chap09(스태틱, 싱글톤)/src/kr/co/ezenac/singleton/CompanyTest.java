package kr.co.ezenac.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();		// private이기 때문에 getInstance() 메소드 사용
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// Object 클래스의 equals() : 주소 비교(데이터 값)
		if(company1.equals(company2)) {
			System.out.println("같은 객체");
		}
		else {
			System.out.println("다른 객체");
		}
		
		// == 연산자 : 주소값 비교
		if(company1.equals(company2)) {
			System.out.println("같은 객체");
		}
		else {
			System.out.println("다른 객체");
		}
	}
}
