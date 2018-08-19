package com.learntocode.lambdaWithMultiThreading;

public class MultiThreadingDemoUsingLambda {

	public static void main(String[] args) {

		//Note here we have directly pass Lambda expression as an argument.
		Thread t = new Thread(() -> {
										for (int i = 0; i < 10; i++) {
											System.out.println("Child thread");
										}
									});
		t.start();// calling child thread starts

		// Main Thread starts
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
