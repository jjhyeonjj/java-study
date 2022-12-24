package kr.co.ezenac.templatemethod;

public abstract class Car {

	final public void run() {		// final 상속을 받더라도 오버라이드 X
		startCar();
		drive();
		stop();
		turnOff();
	}
	// ========== 메서드 추가 ==========
	public void startCar() {
		System.out.println("시동을 켭니다.");
		}
	public abstract void drive();			// 추상메서드
	
	public abstract void stop();			// 추상메서드
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
}
