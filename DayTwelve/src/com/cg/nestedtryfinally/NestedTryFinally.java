package com.cg.nestedtryfinally;

public class NestedTryFinally {
	public static void cal(int x,int y,String s) {
		System.out.println("sum="+(x/y));
		try {
		System.out.println(s.length());
		System.out.println("inner try block:");
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("inner catch block");
		}finally {
			System.out.println("inner finally block:");
		}
	}

}
