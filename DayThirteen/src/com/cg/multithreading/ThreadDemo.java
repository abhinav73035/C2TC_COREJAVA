package com.cg.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExampleOne one= new ThreadExampleOne();
		ThreadExampleTwo two = new ThreadExampleTwo();
		System.out.println(one.getPriority());
		one.start();
		two.start();// implicitly call run method(override the run method)
        // range of priority is 1-10
		// 1 is least priority and 10 is highest priority
		one.setPriority(Thread.MAX_PRIORITY);
		System.out.println(one.getPriority());
	}

}
