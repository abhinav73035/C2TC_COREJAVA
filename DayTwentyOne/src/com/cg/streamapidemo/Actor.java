package com.cg.streamapidemo;

public interface Actor {
	public void act();
	public void speak();
	default void comedy() {
		System.out.println("I can make Comedy");
	}

}
