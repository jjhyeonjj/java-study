package kr.co.ezenac.constructor1;

public class HeroTest {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		hero.name = "이순신";
		System.out.println(hero.toString());

		System.out.println();
		
		Hero hero2 = new Hero("장보고", 185, 87, 280);
		System.out.println(hero2.toString());
		
		System.out.println();
		
		Hero hero3 = new Hero("세종", 500, 65, 260);
		hero3.name = "광개토";
		System.out.println(hero3.toString());
	}

}
