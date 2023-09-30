package com.cg.methodrefrencingdemo;

class Addition{
	public void sum() {
		int a=10;
		int b= 20;
		System.out.println(a+b);
	}
}



public class MethodReferencingUsingNonstaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1-- way	Show s = new Addition()::sum;
		// 2nd way
		Addition a = new Addition();
		Show s = a::sum;
		s.show();

	}

}
