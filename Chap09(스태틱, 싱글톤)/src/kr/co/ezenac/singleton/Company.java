package kr.co.ezenac.singleton;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() {		// static 메서드
		if(instance == null)					// null이면 생성
			instance = new Company();
		
		return instance;
	}
}
