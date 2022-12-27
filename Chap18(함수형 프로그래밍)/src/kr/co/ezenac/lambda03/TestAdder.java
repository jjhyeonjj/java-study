package kr.co.ezenac.lambda03;

import java.util.function.Function;

public class TestAdder {

	public static void main(String[] args) {
		
		Function<Integer, Integer> myAdder = new Adder();
			  //<매개변수 , result값>
		
		int result = myAdder.apply(5);
		System.out.println(result);
	}
}
