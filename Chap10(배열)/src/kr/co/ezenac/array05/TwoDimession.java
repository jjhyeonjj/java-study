package kr.co.ezenac.array05;

public class TwoDimession {

	public static void main(String[] args) {
		int[][] arr = { {1,2,3}, {4,5,6,7} };
		
		int i,j;
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(", \t" + "열개수 : " + arr[i].length);
			System.out.println();
		}
	}
}
