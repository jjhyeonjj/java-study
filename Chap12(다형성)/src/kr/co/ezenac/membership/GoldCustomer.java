package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {
	double salesRatio;

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;
		
		System.out.println("Gold Customer(int, String) 생성자 호출");
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	public static void main(String[] args) {
		// ========== Gold Customer 등급 ==========
		Customer customerK = new GoldCustomer(2024, "김유신");
		customerK.bonusPoint = 8000;
		int priceK = customerK.calcPrice(10000);
		System.out.println(customerK.showInfo() + " 지불금액은 " + priceK + "입니다.");
	}
	
	
}
