package kr.co.ezenac.membership;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
	// ========== 기본 생성자 ==========
	public VIPCustomer() {
		super(1000, "SILVER");
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIP Customer() 생성자 호출");
	}
	// ========== get ==========
	public int getAgentId() {
		return agentId;
	}
}
