package kr.co.ezenac.constructor1;

public class GreatMan2 {

	public static void main(String[] args) {
		
		GreatMan greatMan = new GreatMan();
		greatMan.name = "김유신";
		System.out.println(greatMan.toString());
		System.out.println();
		
		GreatMan greatMan2 = new GreatMan("이순신", 185, 86);
		System.out.println(greatMan2.toString());
		System.out.printf("%s의 키는 %d cm입니다\n", greatMan2.name, greatMan2.tall);
		System.out.println();
		
		GreatMan greatMan3 = new GreatMan("장보고", 178, 76);
		greatMan3.tall = 183;
		greatMan3.setWeight(300);
		System.out.println(greatMan3);
	}

}
