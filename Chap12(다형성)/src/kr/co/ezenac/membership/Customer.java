package kr.co.ezenac.membership;

public class Customer {

	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

//	========== 기본 생성자 ==========
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() 생성자 호출");
//	}	
//	========== 매개변수가 있는 생성자 ==========
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 생성자 호출");	
	}
	// ========== get & set ==========
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	// ========== 가격 메서드 ==========
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	// ========== showInfo 메서드 ==========
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade +
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
}
