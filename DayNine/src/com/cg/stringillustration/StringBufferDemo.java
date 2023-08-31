package com.cg.stringillustration;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer bf=new StringBuffer("hii");
		bf.append("abhinav");
		System.out.println(bf);
		System.out.println(bf.reverse());// its prove that String buffer is muttable
		System.out.println(bf);
		StringBuffer s1= new StringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append(" hii abhinav ");
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		StringBuffer s2= new StringBuffer("hiidear");
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		
		
		
     
	}

}
