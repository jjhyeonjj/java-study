package kr.co.ezenac.mjp.mjp03.h;

public class H0309 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
