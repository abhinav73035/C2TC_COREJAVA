package com.cg.throwthrowsexample;

public class ThrowExampleOne {
	public static void validate(int age) {
		if(age<21 || age>27) {
			throw new ArithmeticException("not eligible");
		}else {
			System.out.println("Eligible to attend military Selection");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         validate(30);
         System.out.println("rest of the code .....");
	}

}
