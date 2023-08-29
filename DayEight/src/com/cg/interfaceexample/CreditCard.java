package com.cg.interfaceexample;

public interface CreditCard {
	public static final int rupiya=12;// by default variable is public static final
	
	public abstract void payment();// by default public abstract
	// in jdk 8 have support default and static method
	/*
	public void m2() {
		only support abstract method in interface except default and static method
		in interface all method are public and abstract except default and static
	}
	*/
	 default void method() {
		System.out.println("hii i'm default method");
	}
	 static void method1(){
		 System.out.println("hii i'm static method");
		 
	 }

}
