package com.cg.finalpstatic;

public class FinalWithMethod {
	private int x=22;
	
	public final void finalMethod() {
		x=23;
		System.out.println("final method can not overridden");
	}
  
}
