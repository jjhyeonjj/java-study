package kr.co.ezenac.studentclass;

public class Student {

	private String major;
	private int studentNum;
	
	public String getMajor() {return major;}
	public void setMajor(String major) {this.major = major;}
	public int getStudentNum() {return studentNum;}
	public void setStudentNum(int studentNum) {this.studentNum = studentNum;}

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.major = "기계과";
		student1.studentNum = 1;
		
		Student student2 = new Student();
		student2.setMajor("화학과");
		student2.setStudentNum(2);
		
		System.out.println("학과는 "+student1.major+"이고, 학번은 "+student1.studentNum+"입니다");
		System.out.println("학과는 "+student2.getMajor()+"이고, 학번은 "+student2.getStudentNum()+"입니다.");
	}
}
