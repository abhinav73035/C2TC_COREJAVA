package com.cg.exceptionshandling;

import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sobjr=new Scanner(System.in);
       System.out.println("Enter First Value");
       int x=sobjr.nextInt();
       System.out.println("Enter Second Value");
       int y=sobjr.nextInt();
       System.out.println(AddTwoNumber.addNumber(x, y));
       // but its gives another value instead of int then gives a Exception Inputmissmatch Exception
	}

}
