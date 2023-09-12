package com.cg.owncustomexception;

import java.util.Scanner;

class InvalidbloodDonateException extends Exception{
	public InvalidbloodDonateException(String s) {
		super(s);
	}
}

public class CustomException {
	public static void validate(int age,int weight)throws InvalidbloodDonateException {
		if(age<18 || weight<55) {
			throw new InvalidbloodDonateException("not eligible");
		}else {
			System.out.println("can donate blood");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sobjr = new Scanner(System.in);
      try {
      System.out.println("Enter age of person");
      int age = sobjr.nextInt();
      System.out.println("Enter weight of Person");
      int weight = sobjr.nextInt();
      
    	 validate(age,weight); 
      }catch(Exception e) {
    	  System.out.println("Exception Occured"+e);
      }
      System.out.println("rest of code...");
	}

}
