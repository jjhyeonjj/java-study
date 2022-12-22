package kr.co.ezenac.bong;

public class DanGob {

	public static void main(String[] args) {
//		for(int dan = 2; dan < 10; dan++) {
//			for (int gob = 1; gob < 10; gob++) {
//				System.out.println(dan + "*" + gob + " = " + dan*gob);
//			}
//		}

		int dan = 2;
		while(dan < 10) {
			int gob = 1;
			while(gob < 10) {
				System.out.println(dan + "*" + gob + " = " + dan*gob);
				gob++;
			} dan++;
		}
	}

}
