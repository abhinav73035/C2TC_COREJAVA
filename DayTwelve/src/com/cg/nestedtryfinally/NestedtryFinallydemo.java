package com.cg.nestedtryfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedtryFinallydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
        try {
        	System.out.println("Enter first value:");
        	int x=sobjr.nextInt();
        	System.out.println("Enter Second Value:");
        	int y=sobjr.nextInt();
        	String s=null;
        	NestedTryFinally.cal(x, y, s);
        	System.out.println("outer Try Block:");
        }catch(InputMismatchException e) {
        	System.out.println(e);
        	System.out.println("outer catch block:");
        }catch(ArithmeticException e) {
        	System.out.println(e);
        	System.out.println("outer catch block:");
        }
        finally {
        	System.out.println("outer finally block");
        	// finally always execute whether exception occurred or not
        }
	}

}
