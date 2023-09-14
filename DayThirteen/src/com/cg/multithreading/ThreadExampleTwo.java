package com.cg.multithreading;

public class ThreadExampleTwo extends Thread {
	// ThreadExampleTwo is called thread class
	public void run() {
		for(int r=0;r<10;r++) {
			System.out.println("hello");
		}
	}

}
