package com.cg.genericillustration;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		GenericConstructor gc = new GenericConstructor(23);
		GenericConstructor gcTwo = new GenericConstructor(23.98);
		GenericConstructor gcThree = new GenericConstructor(14.9f);
	//xxx	GenericConstructor gcFour = new GenericConstructor("c"); character is not support its support only number(premitive) and wrraper type
		
		
		gc.show();
		gcTwo.show();
		gcThree.show();
		
		
		

	}

}
