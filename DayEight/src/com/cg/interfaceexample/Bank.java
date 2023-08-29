package com.cg.interfaceexample;

public class Bank implements CreditCard {
	public void payment() {
		System.out.println("credit card associate with bank");
	}// all the abstract method must be defined in imlemented class
	public void funnyTrip() {
		System.out.println("go to Swittzerland");
	}

}
