package kr.co.ezenac.bong;

public class BongHollys {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		for(i=1; i<=20; i++) {
			if(i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
		} System.out.println(sum);
		
	}
	
}
