package com.cg.lambdademo;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = ()->{
			System.out.println("i'm runnable 1st");
		};
		Runnable r2 = ()->{
			System.out.println("I'm Runnable 2nd");
		};
		Thread first = new Thread(r1);
		first.start();
		Thread second = new Thread(r2);
		second.start();

	}

}
