package com.cg.multithreadingoperation;
class A extends Thread{
	public void run() {
		for(int r=0;r<20;r++) {
			System.out.println("hii");
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	public void run() {
		for(int r=0;r<20;r++) {
			System.out.println("hello");
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SleepExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a = new A();
       B b = new B();
       a.start();
       b.start();
	}

}
