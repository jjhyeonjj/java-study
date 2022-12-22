package kr.co.ezenac.constructor1;

public class Hero {

	String name;
	int tall;
	int weight;
	int footsize;
	
// 기본생성자(디폴트 생성자)
	public Hero() {
	
	}

	public Hero(String name, int tall, int weight, int footsize) {
		//super();
		if(tall > 300) {
			System.out.println("값을 잘못 입력하셨습니다.");
			return;
		}
		this.name = name;
		this.tall = tall;
		this.weight = weight;
		this.footsize = footsize;
		
	}
	
	@Override
	public String toString() {
		
		return name +"님의 키는 "+ tall +"cm이고, 몸무게는 "+ weight +"kg이고, 발사이즈는 "+ footsize +"mm입니다." ;
	}
	
}
