package kr.co.ezenac.project.grade;
/*
 *    S	      A	      B		  C	  	  D		  F
 * 	=============================================
 * 	100~95	94~90	89~80	79~70	69~60	60미만
 */
public class MajorEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		
		String grade;
		if(score<=100 && score>=95)
			grade = "S";
		else if(score<=94 && score>=90)
			grade = "A";
		else if(score<=89 && score>=80)
			grade = "B";
		else if(score<=79 && score>=70)
			grade = "C";
		else if(score<=69 && score>=60)
			grade = "D";
		else
			grade = "F";
		
		return grade;
	}

}
