package com.cg.polymorphism;

public class ExecutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj =new OverloadingDemo(); 
		OverloadingDemo obj2 =new OverloadingDemo(45,48);
		OverloadingDemo obj3 =new OverloadingDemo(45);
		OverloadingDemo obj4 =new OverloadingDemo(4.9f,5);
		OverloadingDemo obj5 =new OverloadingDemo(5,12.8f);
		OverloadingDemo obj6 =new OverloadingDemo(7.5f);
		OverloadingDemo obj7 =new OverloadingDemo(41.5f,84.7f);
		
		OverloadingMethod ovbr1 =new OverloadingMethod();
		System.out.println(ovbr1.m2(3));

	}

}
