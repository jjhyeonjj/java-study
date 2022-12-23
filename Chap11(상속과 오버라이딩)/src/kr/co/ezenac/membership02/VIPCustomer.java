package kr.co.ezenac.membership02;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	// ========== 기본 생성자 ==========
//	public VIPCustomer() {
//		super(1000, "SILVER");
//		this.customerGrade = "VIP";
//		this.bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIP Customer() 생성자 호출");
//	}
	// ========== 생성자 추가 ==========
	public VIPCustomer(int customerId, String customer) {
		super(customerId, customer);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;		// 보너스 포인트 5% 적립
		salesRatio = 0.1;			// 제품 구매 시 10% 할인
		
		System.out.println("VIP Customer(int, String) 생성자 호출");
	}
	// ========== get ==========
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price - (int)(price * salesRatio);
	}

	
}
