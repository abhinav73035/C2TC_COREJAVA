package com.cg.abstractexample;
// this class is called cancrete class
public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	/*
	 	 void makeSound() {
		cannot reduce the visibility public to default
	}
*/
	public void makeSound() {
		System.out.println(getName()+   "  bark");// it must be implement abstract method in subclass those who extends the Animal class
		
	}
	void color() {
		System.out.println("Brown");
	}
}
