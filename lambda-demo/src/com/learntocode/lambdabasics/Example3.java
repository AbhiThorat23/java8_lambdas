package com.learntocode.lambdabasics;

/****************************** WITHOUT LAMBDA EXPRESSION ***************************************************/

interface MathService1 {
	public int square(int a);
}

class Square implements MathService1 {
	@Override
	public int square(int a) {
		return a*a;
	}
}

/**
 * Demo Lambda Expression for invoking a method having return type and only one Parameter as an arguments.
 * @author Abhijit Thorat
 *
 */
public class Example3 {
	public static void main(String[] args) {
		MathService1 mathService = new Square();
		System.out.println("square of no is: "+mathService.square(5));
	}

}


/****************************** WITH LAMBDA EXPRESSION ***************************************************/

/* interface MathService1 {
	public int square(int a);
}

*//**
 * Demo Lambda Expression for invoking a method having return type and only one Parameter as an arguments.
 * @author Abhijit Thorat
 *
 *//*
public class Example3 {
	public static void main(String[] args) {
		
		MathService1 mathService1 = (int a)->{return a*a;};
		System.out.println("Square of no is: "+mathService1.square(5));
		
		//Simplified Lambda: Removing type of parameter, curly braces, and return statement.
		MathService1 mathService2 = (a)->a*a;
		System.out.println("Square of no simplified way: "+mathService2.square(5));
		
		//More Simplified Lambda: Removing parenthesis if single parameter is there.
		MathService1 mathService3 = a->a*a;
		System.out.println("Square of no more simplified way: "+mathService3.square(5));
	}
}
*/