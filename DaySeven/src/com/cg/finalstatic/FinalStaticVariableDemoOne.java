package com.cg.finalstatic;

public class FinalStaticVariableDemoOne {
	private final static int y;
	public void methodDecision() {
		// xxx y=45;
		System.out.println("can't assign  the value of y because its a final and static variable and methodDecesion are executed after the main block");
	}
	static {
		y=34;
		System.out.println("use for assign the value at first time not use for reassign the value");
		
	}

}
