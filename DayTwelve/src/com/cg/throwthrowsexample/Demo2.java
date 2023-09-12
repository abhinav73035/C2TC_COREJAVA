package com.cg.throwthrowsexample;

public class Demo2 {
	public static void validate(int age) {
		if(age<21 || age>27) {
			
		  throw new ArithmeticException("Not Eligible");
			
		}else {
			System.out.println("Eligible for military selection");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(30);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
      System.out.println("rest of code....");
	}

}
