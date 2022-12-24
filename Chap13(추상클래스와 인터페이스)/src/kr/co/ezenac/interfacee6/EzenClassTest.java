package kr.co.ezenac.interfacee6;

public class EzenClassTest {

	public static void main(String[] args) {
		EzenClass eClass = new EzenClass();
		
		X xClass = eClass;
		xClass.x();
		System.out.println();
		
		Y yClass = eClass;
		yClass.y();
		System.out.println();
		
		EzenClass iClass = eClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
	}
}
