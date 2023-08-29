package com.cg.interfaceexample;

public class InterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Creditcard cr=new CreditCard(); can't initiate instant only create a reference
		CreditCard cr=new Bank();
		cr.payment();
	// xxx	cr.funnyTrip(); not defined in CreditCard interface
		Bank b=new Bank();
		b.payment();
		b.funnyTrip();
// interface are use for achieve 100% abstraction and multiple inheritance using interface
		b.method();
		CreditCard.method1();
	}

}
