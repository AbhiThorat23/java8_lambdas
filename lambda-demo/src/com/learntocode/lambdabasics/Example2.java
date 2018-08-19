package com.learntocode.lambdabasics;

/****************************** WITHOUT LAMBDA EXPRESSION ***************************************************/

interface MathService {
	public int add(int a, int b);
}

class Addition implements MathService {
	@Override
	public int add(int a, int b) {
		return a+b;
	}
}

/**
 * Demo Lambda Expression for invoking a method having return type and More than one Parameter as an arguments.
 * @author Abhijit Thorat
 *
 */
public class Example2 {
	public static void main(String[] args) {
		MathService mathService = new Addition();
		System.out.println("Addition of two no is: "+mathService.add(5,4));
	}

}

/****************************** WITH LAMBDA EXPRESSION ***************************************************/

/* interface MathService {
	public int add(int a, int b);
}

*//**
 * Demo Lambda Expression for invoking a method having return type and More than one Parameter as an arguments.
 * @author Abhijit Thorat
 *
 *//*
public class Example2 {
	public static void main(String[] args) {
		
		MathService mathService1 = (int a, int b)->{return a+b;};
		System.out.println("Addition of two no is: "+mathService1.add(5,4));
		
		//Simplified Lambda
		MathService mathService2 = (a,b)->a+b;
		System.out.println("Addition of two no using simplified Lambda: "+mathService2.add(5,4));
	}
}
*/