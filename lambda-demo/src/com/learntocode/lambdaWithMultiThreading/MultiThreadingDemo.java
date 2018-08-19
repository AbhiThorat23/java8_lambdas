package com.learntocode.lambdaWithMultiThreading;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}
	
}

public class MultiThreadingDemo {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();//calling child thread starts
		
		//Main Thread starts
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

}
