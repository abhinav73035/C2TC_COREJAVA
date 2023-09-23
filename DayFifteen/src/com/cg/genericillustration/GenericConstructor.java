package com.cg.genericillustration;

public class GenericConstructor {
	private double s;
	
	public <T extends Number> GenericConstructor(T data) {
		s = data.doubleValue();
	}
    void show() {
    	System.out.println("Value of Double is:" +s);
    }
}
