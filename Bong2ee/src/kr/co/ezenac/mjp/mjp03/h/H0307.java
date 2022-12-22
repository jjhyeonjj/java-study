package kr.co.ezenac.mjp.mjp03.h;

public class H0307 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*10)+1;
			arr[i] = r;
			sum += arr[i];
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println("평균 : "+sum/arr.length);
	}
}
