package com.cg.streamapidemo;

public class Hero implements Actor {

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
	public void comedy() {
		System.out.println("I can make people laugh");
	}

}
