package kr.co.ezenac.constructor1;

public class GreatMan {
	
	String name;
	int tall;
	private int weight;
	int footsize;

	public GreatMan() {
		
	}
	
	public GreatMan(String name, int tall, int weight) {
		//super();
		this.name = name;
		this.tall = tall;
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight < 0 || weight > 200) {
			System.out.println("잘못된 값입니다.");
			return;
		} 
		this.weight = weight;
	}

	@Override
	public String toString() {
		return name +"의 키는 "+ tall +"cm이고, 몸무게는 "+ weight +"kg 입니다.";
	}
	
	
}
