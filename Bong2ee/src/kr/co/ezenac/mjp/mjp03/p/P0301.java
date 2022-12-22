package kr.co.ezenac.mjp.mjp03.p;

public class P0301 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			if(i == 10) 
				System.out.print(i + " = " + sum);
			else
				System.out.print(i + " + ");
		}
	}
}
