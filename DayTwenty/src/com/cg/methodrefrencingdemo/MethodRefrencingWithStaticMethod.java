package com.cg.methodrefrencingdemo;

class Printer{
	public static void print() {
		System.out.println("Print Something");
	}
}

public class MethodRefrencingWithStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Printer p = new Printer();
		// static method referencing-- pass as a function to a function
		Sayable sOne = Printer::print; 
		sOne.say();

	}

}
