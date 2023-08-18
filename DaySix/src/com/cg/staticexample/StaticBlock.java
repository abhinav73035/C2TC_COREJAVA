package com.cg.staticexample;

public class StaticBlock {
	private int num1;
	private static int num2;
	
	static {
		System.out.println("welcome to static block:");
		num2=34;
		System.out.println(num2);
	}
	
	public StaticBlock() {
		System.out.println("object are invoked");
	}
	

}
