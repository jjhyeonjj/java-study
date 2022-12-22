package kr.co.ezenac.bong;

public class BangJeongSig {

	public static void main(String[] args) {
		// 2x + 4y = 10이 되는 모든 해를 구하시오.
		
		int x = 0;
		for( ; x < 11; x++) {
			for (int y = 0; y < 11; y++) {
				if (((2*x)+(4*y)) == 10) {
					System.out.println("x = " + x + ", " + "y = " + y);
				}
			}
		}

	}

}
