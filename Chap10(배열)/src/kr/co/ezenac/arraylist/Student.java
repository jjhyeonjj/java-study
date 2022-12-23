package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class Student {

	private int studenId;				// 멤버변수
	private String studentName;			// 멤버변수
	
	//______________타입 __________참조변수
	ArrayList<Subject> subjectList;
	
	// 생성자
	public Student(int studentId, String studentName) {
		//super();
		this.studenId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();		// 학생들마다 별도로 ArrayList가 만들어짐.
	}
	// 과목을 추가하는 기능
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	// 한 학생의 score를 보여주는 기능
	public void showInfo() {
		int total = 0;			// 지역변수
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(
			"학생"+ this.studentName +"의 "+ subject.getName() +
			"과목 성적은 "+ subject.getScorePoint() +"입니다.");
		}
		System.out.println("학생"+ this.studentName +"의 총점은 "+ total +"입니다.");
	}
	
	
	
	
}
