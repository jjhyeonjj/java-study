package kr.co.ezenac.generic;

public class GenericThreeDPrinter<T extends Material> {

	private T material;			// T 자료형으로 선언한(참조)변수

	// ========== get & set ==========
	public T getMaterial() {			// T 자료형을 반환하는 제네릭 메서드
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		
		return material.toString();
	}
	
	public void print() {
		material.doPrint();
	}
	
}
