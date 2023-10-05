package com.cg.streamapidemo;

public class Villain implements Actor {

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("I can act");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("I can speak");
	}
	public void rude() {
		System.out.println("I can  be rude");
	}

}
