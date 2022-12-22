package kr.co.ezenac.mjp.mjp03.p;

public class P0310 {

	public static void main(String[] args) {
			
		int score[][] = {{50, 45}, 
						 {64, 87},
						 {91, 96},
						 {93, 95}};
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++)
				sum += score[i][j];
		}
		int a = score.length;
		int b = score[0].length;
		
		System.out.println("전체 평점 평균 : "+(double)sum/(a*b));
	}
}
