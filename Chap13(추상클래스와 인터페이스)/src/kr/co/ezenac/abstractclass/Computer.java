package kr.co.ezenac.abstractclass;

public abstract class Computer {	// 추상클래스
	abstract void display();		// 추상메서드 선언
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
