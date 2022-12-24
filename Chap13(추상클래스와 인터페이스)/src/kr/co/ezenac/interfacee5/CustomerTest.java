package kr.co.ezenac.interfacee5;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayWorld();
		customer.order();
		System.out.println();
		
		Buy buyer = customer; 	// = new Customer(); <- customer;와  동일
		buyer.buy();			// 자신의 메서드만 보임(Buy)
		buyer.order();
		System.out.println();
		
		Sell seller = customer;
		seller.sell();			// 자신의 메서드만 보임(Sell)
		seller.order();
	
	}
}
