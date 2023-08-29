package com.cg.polymorphism;

public class OverloadingDemo {
	private float x;
	private float y;
	public OverloadingDemo() {
		//super();
		// TODO Auto-generated constructor stub
		x=2;
		y=6;
		System.out.println(x+" "+y);
	}
	public OverloadingDemo(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
	}
	public OverloadingDemo(int y) {
		this.x=y;
		System.out.println(this.x+" "+this.y);
	}
	public OverloadingDemo(int x,float y) {
		this.x=x;
		this.y=y;// if in case y is call local variable and they print integer value because they gives more priority
		System.out.println(this.x+" "+this.y);
	}
	public OverloadingDemo(float y) {
		this.x=x;
		System.out.println(x+" "+y);
	}
	/*
	public OverloadingDemo(float x) {
		this.x=x;
		// gives error because same signature
		System.out.println(x+" "+y);
	}  */
	public OverloadingDemo(float x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+" "+this.y);
	}
	public OverloadingDemo(float x,float y) {
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
	}
}
