package kr.co.ezenac.member;

public class MonitorTest {

	public static void main(String[] args) {

		Monitor monitor = new Monitor();		//생성자
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channel = 5;
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		monitor.channelDown();
		
	}
}
