package com.cg.exceptionshandling;

// import java.util.Scanner;
import java.lang.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddTwoNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] a= {2,34,6,45,7};
		Scanner sobjr=new Scanner(System.in);
		try {
		System.out.println("Enter size of array");
		int size=sobjr.nextInt();
		int[] a=new int[size];
		for(int r=0;r<a.length;r++) {
			a[r]=sobjr.nextInt();
		}
		AddNumber.addValue(a);
		}
		/*
		catch(Exception e) {
			System.out.println(e.getMessage());
			its catch all the exception other is not usable so its gives error
		} */
		catch(InputMismatchException imme) {
			System.out.println(imme);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
