package com.cg.lambdademo;

public class AddImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNumber ref = (int b,int c)->{return (c+b);};
			
		System.out.println(ref.sum(3, 8));

	}

}
