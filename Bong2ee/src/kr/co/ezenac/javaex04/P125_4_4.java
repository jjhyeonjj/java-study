package kr.co.ezenac.javaex04;

public class P125_4_4 {
// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
	
		while(true) {
			i++;
			if(i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			 }
			if(sum >= 100) {
				break;
			}	
		} 
		System.out.println(i);
	}

}
