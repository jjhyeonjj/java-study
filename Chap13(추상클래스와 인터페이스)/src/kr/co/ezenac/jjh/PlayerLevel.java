package kr.co.ezenac.jjh;

public abstract class PlayerLevel {
	int count;
	final void play(int count) {
		go(count);
	}
	public void go(int count) {
		showLevelMessage();
		run();
		for(int i=1; i <= count; i++) {
			jump();
		} count++;
		turn();
	}
	
	public abstract void showLevelMessage();
	public abstract void turn();
	public abstract void jump();
	public abstract void run();

	

	
}
