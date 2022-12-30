package kr.co.ezenac.project.grade;
/*
 * 일반과목학점
 *		   A	  B	      C		  D	  	  F
 * 		=============================================
 * 		100~90	89~80	79~70	69~55	55미만
 */
public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {

		String grade;
		if(score<=100 && score>=90) {
			grade = "A";
		} else if(score<=89 && score>=80) {
			grade = "B";
		} else if(score<=79 && score>=70) {
			grade = "C";
		} else if(score<=69 && score>=55) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}

}
