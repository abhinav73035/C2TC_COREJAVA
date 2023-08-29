package com.cg.abstractexample;

public abstract class Animal {
	public String name;
	public   Animal(String name) {
		 this.name= name;
	}
	public String getName() {
		return this.name;
	}
	public abstract void makeSound();// if method is abstract then necessary to declare class as a abstract
//if class is abstract they not required to any method,member data is abstract
	// in abstract class abstract and non abstract method are work

}
