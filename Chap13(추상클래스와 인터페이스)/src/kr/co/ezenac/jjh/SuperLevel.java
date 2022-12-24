package kr.co.ezenac.jjh;

public class SuperLevel extends PlayerLevel {
	@Override
	public void showLevelMessage() {
		System.out.println("===== 상급자 레벨 ======");
	}
	@Override
	public void turn() {
		System.out.println("턴을 합니다.");
	}
	@Override
	public void jump() {
		System.out.println("아주 높이 점프 합니다.");
	}
	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

}