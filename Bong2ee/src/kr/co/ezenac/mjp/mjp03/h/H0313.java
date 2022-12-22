package kr.co.ezenac.mjp.mjp03.h;

public class H0313 {

	public static void main(String[] args) {
		
		for(int i=1; i<=99; i++) {
			if(i>10) {
				if((i/10)%3==0 || (i%10)%3==0) {
					if(i!=10 && i!=20 && i!=40 && i!=50 && i!=70 && i!=80)
					System.out.println(i+" 짝");
				}
			}
			else {
				if(i%3==0) {
					System.out.println(i+" 짝");
				}
			}
			
		}
	}
}
