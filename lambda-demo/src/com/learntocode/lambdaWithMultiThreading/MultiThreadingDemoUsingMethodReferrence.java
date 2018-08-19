package com.learntocode.lambdaWithMultiThreading;

public class MultiThreadingDemoUsingMethodReferrence {

	public static void main(String[] args) {

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
