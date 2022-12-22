package kr.co.ezenac.javaex06;
// Student 클래스 정의
public class Student {
	String name;	// 학생이름
	int ban;		// 반
	int no;			// 번호
	int kor;		// 국어점수
	int eng;		// 영어점수
	int math;		// 수학점수
	
	// ==================== 기본생성자 ====================
	public Student() {
		
	}
	
	// ==================== 매개변수가 있는 생성자 ====================
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		//super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// ==================== info() 메서드 추가 ====================
	public String info(){
		return name+", "+ ban+", "+ no+", "+ kor+", "+ eng+", "+ math +", "+ total()+ ", "+ average();
	}
	
	public int total() {
			
			return kor + eng + math;
		}
	
	public float average() {
		
		return (int)(total() / 3f * 10 + 0.5f) / 10.0f;
	}
	
	// ==================== get() 메서드 추가 ====================
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	public float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10.0f;
	}
}
