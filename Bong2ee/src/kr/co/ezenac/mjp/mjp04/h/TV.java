package kr.co.ezenac.mjp.mjp04.h;

public class TV {
	String brand;
	int year;
	int inch;
	
	public TV(String brand, int year, int inch) {
		//super();
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println
		(brand+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV lgTv = new TV("LG", 2017, 32);
		lgTv.show();
	}
	
	
}
