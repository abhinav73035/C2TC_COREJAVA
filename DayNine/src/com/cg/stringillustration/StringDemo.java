package com.cg.stringillustration;

public class StringDemo {
	public String str="hello";//this is create memory in heap iside String constant pool area
	public String str2="hello";//this is not create new memory its refer str because in scp str2 is search the own value in scp if available they only refer if not available create new memory
	public String str3="Hello";// its create a new memmory in scp area inside heap
	public String s= new String("hello");
	public String s2=new String(" hello dear ");
	
	@Override
	public String toString() {
		return "StringDemo [str=" + str + ", str2=" + str2 + ", str3=" + str3 + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
