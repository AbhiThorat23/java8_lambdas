package com.learntocode.lambdaWithMultiThreading;

public class MultiThreadingDemoUsingAnonymousInnerClass {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Child thread");
				}
			}

		});
		t.start();// calling child thread starts

		// Main Thread starts
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

}
