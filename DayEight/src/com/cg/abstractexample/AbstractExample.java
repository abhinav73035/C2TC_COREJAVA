package com.cg.abstractexample;

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // canot crete onject of abstract class you only create a reference
		//Animal a=new Animal();  
		Animal a1=new Dog("buddy");
		a1.makeSound();
	//	a1.color(); they gives error color is indefined in Animal Class 
		Dog d1=new Dog("Shera");
		d1.color();
		d1.makeSound();
		Cat c1 = new Cat("mistu");
		c1.makeSound();
		
		
	}

}
