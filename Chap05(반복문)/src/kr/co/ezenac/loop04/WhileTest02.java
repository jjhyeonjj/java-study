package kr.co.ezenac.loop04;

public class WhileTest02 {

	public static void main(String[] args) {
		// 1~100사이의 5와 7의 배수를 출력하고
		// 해당 개수도 출력하시오.(5와 7의 공배수)
		
//		int num = 1;
//		while(num <= 100) {
//			if(num % 5 == 0 && num % 7 == 0) {
//				System.out.println(num);
//				}
//			num++;
//		}
		
		int num = 1;
		int count = 0;
		
		while((num++) <= 100) {
			//1)
//			if((num % 5) != 0 || (num % 7) != 0)
//				continue; // 5와 7의 배수가 아니면 위로 이동
			
			//2)
//			if((num % 5) != 0)
//				continue;
//			if((num % 7) != 0)
//				continue;
			
//			count++;;  		// 
//			System.out.println(num);

			//3)
			if((num % 5) == 0 && (num % 7) == 0) {
				 count++;
			System.out.println(num);	
			} 
		}
		System.out.println("count : "+count);
	}

}
