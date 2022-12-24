package kr.co.ezenac.interfacee2;

public class RemoteTest {

	public static void main(String[] args) {
		// 인터페이스도 일종의 조상이므로 필드(변수)의 다형성이 허용됨
		RemoteControl rcontrol	= new Audio();
		rcontrol.turnOn();
		rcontrol.setVolume(15);
		rcontrol.setVolume(-100);
		rcontrol.turnOff();
		
		System.out.println();
		
		rcontrol = new Television();
		rcontrol.turnOn();
		rcontrol.setVolume(15);
		rcontrol.setVolume(-50);
		rcontrol.turnOff();
	}
}
