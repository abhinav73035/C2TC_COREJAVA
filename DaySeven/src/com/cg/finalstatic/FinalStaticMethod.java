package com.cg.finalstatic;

public class FinalStaticMethod {
private  int num=2;
private final static int n=34;
public final static void finalStaticMethod() {
	// xxx n=45;
	System.out.println("can't reassign and assign the value of n");
	System.out.println("can't be overridden");
}
}
