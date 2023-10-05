package com.cg.streamapidemo;

public class ActorExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor a = new Hero();
		a.act();
		a.comedy();
		a.speak();
		Actor b = new Villain();
		b.act();
		b.comedy();
		b.speak();

	}

}
