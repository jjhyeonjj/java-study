package kr.co.ezenac.array;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] charArr = new char[26];
		char ch = 'A';
		
		for(int i=0; i<charArr.length; i++) {
			charArr[i] = ch++;
		}
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i] + ", " + (int)charArr[i]);
		}
		System.out.println();
		
		// 향상된 for문 사용
		for(char alpha : charArr) {
			System.out.println(alpha + ", " + (int)alpha);
		}
		

	}

}
