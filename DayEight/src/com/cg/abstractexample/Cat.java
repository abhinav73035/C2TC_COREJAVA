package com.cg.abstractexample;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
public void makeSound() {
	System.out.println(getName()+   "  meaow");
}

}
