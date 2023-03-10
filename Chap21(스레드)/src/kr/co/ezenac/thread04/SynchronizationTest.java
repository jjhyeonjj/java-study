package kr.co.ezenac.thread04;

class Bank{
	private int money = 10000;
	
	public synchronized void deposit(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {e.printStackTrace();}
		
		setMoney(m + save);
	}
	
	public synchronized void withdraw(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {e.printStackTrace();}
		
		setMoney(m - minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Lee extends Thread {
	@Override
	public void run() {
		System.out.println("입금 시작");
		SynchronizationTest.mybank.deposit(3000);
		System.out.println("3000원 입금 : " + SynchronizationTest.mybank.getMoney());
	}
}

class Kim extends Thread {
	
	@Override
	public void run() {
		System.out.println("출금 시작");
		SynchronizationTest.mybank.withdraw(1000);
		System.out.println("1000원 출금 : " + SynchronizationTest.mybank.getMoney());
	}
}

public class SynchronizationTest {

	public static Bank mybank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Lee threadLee = new Lee();
		threadLee.start();
		
		Thread.sleep(200);
		
		Kim threadKim = new Kim();
		threadKim.start();
	}
}
