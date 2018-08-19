package com.learntocode.lambdaWithMultiThreading;

/**
 * Lambda Expression should be glue code. 
 * Two Lines may be too many. 
 * So here we have used Method reference to keep lambda small and add complex logic in
 * that method. we can reuse that method as many times as we want.
 * 
 * @author Abhijit Thorat
 *
 */
public class MultiThreadingDemoUsingLambdaExpression {

	public static void main(String[] args) {

		Thread t = new Thread(MultiThreadingDemoUsingLambdaExpression::childThreadMethod);

		t.start();// calling child thread starts

		// Main Thread starts
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

	/**
	 * This method is referenced by Method Reference concept in Java 8. We can reuse
	 * this method as many time as we want.
	 */
	private static void childThreadMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

}
