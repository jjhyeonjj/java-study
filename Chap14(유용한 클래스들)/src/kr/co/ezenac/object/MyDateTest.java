package kr.co.ezenac.object;

/*
 * 날짜를 구현한 클래스 MyDate가 있습니다.
 * 날짜가 같으면 equals() 메서드 결과가 true가 되도록 구현하시오.
 * 
 * hashCode() 메서드도 구현해보시오.
 */
class MyDate {

	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		//super;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate mdate = (MyDate) obj;
			if(this.day == mdate.day &&
				this.month == mdate.month &&
				this.year == mdate.year)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		if(day == this.day && month == this.month && year == this.year)
		return day ;
		return 0;
	}
}

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(2, 9, 2022);
		MyDate date2 = new MyDate(2, 9, 2023);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	
	}
}
