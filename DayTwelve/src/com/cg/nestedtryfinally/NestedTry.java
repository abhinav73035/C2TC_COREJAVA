package com.cg.nestedtryfinally;

public class NestedTry {
	String s="hello my name is abhinav";
	int lengthofstring=7;
	String s2=null;
	public static void evaluate() {
		NestedTry ns=new NestedTry();
		try {
		if(ns.s.charAt(ns.lengthofstring)>='a') {
			System.out.println("value is:"+ns.s.charAt(ns.lengthofstring));
			try {
			if(ns.s2.length()>0) {
				System.out.println("inner if ");
			}
			System.out.println("this is inner try block");
			}catch(NullPointerException e) {
				System.out.println(e);
				System.out.println("end inner catch");
			}
		}
		System.out.println("this is outer try block");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("outer catch are closed");
		}
	}
	

}
