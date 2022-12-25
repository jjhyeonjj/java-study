package kr.co.ezenac.generic;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		 
		GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
		//GenericThreeDPrinter<Water> waterPrinter = new GenericThreeDPrinter<>();
		//Material에 포함되어있는것만 가능
		
		powderPrinter.print();
		plasticPrinter.print();
	}
}
