package kr.co.ezenac.jjh;

public class Player {

	public static void main(String[] args) {
		PlayerLevel player = new BeginnerLevel();
		player.play(1);
		
		System.out.println();
		
		PlayerLevel player2 = new AdvancedLevel();
		player2.play(2);
		
		System.out.println();
		
		PlayerLevel player3 = new SuperLevel();
		player3.play(3);
	}
}
