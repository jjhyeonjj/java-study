package kr.co.ezenac.project.grade;
/*
 * 	- 골프 과목이 새로 개설되고, 이 과목의 평가 정책은 pass / fail로 정해졌습니다.
 * 	- 70점 이상인 경우는 pass, 미만인 경우는 fail입니다.
 */
public class PassFailEvaluation implements GradeEvaluation  {

	@Override
	public String getGrade(int score) {
		
		if(score >= 70 && score <= 100)return "P";
		else return "F";
		
			
	}

}
