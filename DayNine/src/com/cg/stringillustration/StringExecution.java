package com.cg.stringillustration;

public class StringExecution {

	public static void main(String[] args) {
		String s="hello";
		// TODO Auto-generated method stub
		StringDemo sd=new StringDemo();
		System.out.println(sd.str==sd.str2);//it is compare reference
		System.out.println(sd.str.hashCode());
		System.out.println(sd.str2.hashCode());
		System.out.println(sd.str3.hashCode());
		System.out.println(((sd.str).getClass()).getName());
		System.out.println(sd.str2.getClass().getName());
		System.out.println(sd.str3.getClass().getName());
		System.out.println(s.getClass().getName());
		System.out.println(sd.str==s);
		System.out.println(sd.str==sd.str3);
		System.out.println(sd.str.equals(sd.str2));
		System.out.println(sd.str.equals(sd.str3));
		System.out.println(sd.str.toUpperCase());
		System.out.println(sd.str);
		//sd.str=sd.str.toUpperCase();
		System.out.println(sd.str);
		System.out.println(sd.s==sd.str);
		System.out.println(sd.s.equals(sd.str));
		System.out.println(sd.s2.length());
		System.out.println((sd.s2.trim()).length());
		System.out.println(sd.s2.strip());
		

	}

}
