package kr.co.ezenac.mjp.mjp03.p;

public class P0204 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("==="+i+"단===");
			
			for(int j=1; j<=9; j++) {
				int result = i*j;
				System.out.println(i+"*"+j+"="+result);
			}
		}
	}
}
