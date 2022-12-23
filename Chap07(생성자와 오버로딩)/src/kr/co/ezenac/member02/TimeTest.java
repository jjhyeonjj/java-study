package kr.co.ezenac.member02;

public class TimeTest {

	public static void main(String[] args) {

		Time time = new Time();
		//time.setHour(-20);
		time.setHour(10);
		//System.out.println(time.getHour());
		
		time.setMinute(30);
		time.setSecond(50);
		System.out.println(time.toString());
		
		time.setHour(50);
		time.setMinute(100);
		time.setSecond(100);
		System.out.println(time.toString()); 	//재할당이 안됨.
												//전에 할당된 hour: 10, minute: 30, second: 50 값이 나옴.
	}

}
