package com.cg.lambdademo;

public class WitthLambdaFunction  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Lambda expression provides implementation of functional interface. 
		 * An interface which has only one abstract method is called functional interface.
		 * Java provides an anotation @FunctionalInterface, 
		 * To provide the implementation of Functional interface.
         * Less coding.
         * which is used to declare an interface as functional interface.
		 */
         Sayable s1=()->{
        	 System.out.println("Abhinav");
        	 return "Hii ";
         };
         System.out.println(s1.say());
	}

	
}
